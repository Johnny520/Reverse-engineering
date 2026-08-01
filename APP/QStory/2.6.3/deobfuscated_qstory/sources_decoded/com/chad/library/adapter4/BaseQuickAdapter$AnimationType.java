package com.chad.library.adapter4;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/chad/library/adapter4/BaseQuickAdapter$AnimationType", "", "Lcom/chad/library/adapter4/BaseQuickAdapter$AnimationType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "com.github.CymChad.brvah"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BaseQuickAdapter$AnimationType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ BaseQuickAdapter$AnimationType[] $VALUES;
    public static final BaseQuickAdapter$AnimationType AlphaIn = new BaseQuickAdapter$AnimationType("AlphaIn", 0);
    public static final BaseQuickAdapter$AnimationType ScaleIn = new BaseQuickAdapter$AnimationType("ScaleIn", 1);
    public static final BaseQuickAdapter$AnimationType SlideInBottom = new BaseQuickAdapter$AnimationType("SlideInBottom", 2);
    public static final BaseQuickAdapter$AnimationType SlideInLeft = new BaseQuickAdapter$AnimationType("SlideInLeft", 3);
    public static final BaseQuickAdapter$AnimationType SlideInRight = new BaseQuickAdapter$AnimationType("SlideInRight", 4);

    private static final /* synthetic */ BaseQuickAdapter$AnimationType[] $values() {
        return new BaseQuickAdapter$AnimationType[]{AlphaIn, ScaleIn, SlideInBottom, SlideInLeft, SlideInRight};
    }

    static {
        BaseQuickAdapter$AnimationType[] baseQuickAdapter$AnimationTypeArr$values = $values();
        $VALUES = baseQuickAdapter$AnimationTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(baseQuickAdapter$AnimationTypeArr$values);
    }

    private BaseQuickAdapter$AnimationType(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static BaseQuickAdapter$AnimationType valueOf(String str) {
        return (BaseQuickAdapter$AnimationType) Enum.valueOf(BaseQuickAdapter$AnimationType.class, str);
    }

    public static BaseQuickAdapter$AnimationType[] values() {
        return (BaseQuickAdapter$AnimationType[]) $VALUES.clone();
    }
}
