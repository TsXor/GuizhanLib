package net.guizhanss.guizhanlib.minecraft.helper.entity;

import lombok.experimental.UtilityClass;
import org.bukkit.entity.PufferFish;

import javax.annotation.Nonnull;

/**
 * 河豚({@link PufferFish})
 *
 * @author ybw0014
 */
@UtilityClass
@SuppressWarnings({ "unused" })
public final class PufferFishHelper {
    /**
     * 获取河豚的膨胀状态的中文
     *
     * @param level
     *     膨胀状态
     *
     * @return 膨胀状态的中文
     */
    @Nonnull
    public static String getPuffState(int level) {
        /****/ if (level == 0) {
            return "未膨胀";
        } else if (level == 1) {
            return "半膨胀";
        } else if (level == 2) {
            return "完全膨胀";
        } else {
            return "未知";
        }
    }
}
