.class public LYue/ۥۣ۠ۥۧ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۥۧ$ۥ;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x31f

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ۥ(Ljava/util/LinkedHashMap;I)[B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/Integer;",
            ">;I)[B"
        }
    .end annotation
.end method

.method public static native ۥ۟(Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public static native ۥ۟۟(Ljava/util/LinkedHashMap;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation
.end method
