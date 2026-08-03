.class public LYue/ۥۡۥۣۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۥۣۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/util/Property<",
            "*TV;>;",
            "Landroid/graphics/Path;",
            ")",
            "Landroid/animation/PropertyValuesHolder;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Landroid/animation/PropertyValuesHolder;->ofObject(Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    return-object p0
.end method
