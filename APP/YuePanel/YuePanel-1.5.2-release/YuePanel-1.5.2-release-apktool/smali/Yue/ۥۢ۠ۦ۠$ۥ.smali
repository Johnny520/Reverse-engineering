.class public LYue/ۥۢ۠ۦ۠$ۥ;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۠ۦ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "LYue/\u06e5\u06e2\u06e0\u06e6\u06e0;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    check-cast p1, LYue/ۥۢ۠ۦ۠;

    invoke-virtual {p0, p1}, LYue/ۥۢ۠ۦ۠$ۥ;->ۥ(LYue/ۥۢ۠ۦ۠;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    check-cast p1, LYue/ۥۢ۠ۦ۠;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2}, LYue/ۥۢ۠ۦ۠$ۥ;->ۥ۟(LYue/ۥۢ۠ۦ۠;Ljava/lang/Float;)V

    return-void
.end method

.method public ۥ(LYue/ۥۢ۠ۦ۠;)Ljava/lang/Float;
    .locals 0

    iget p1, p1, LYue/ۥۢ۠ۦ۠;->mThumbPosition:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟(LYue/ۥۢ۠ۦ۠;Ljava/lang/Float;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p1, p2}, LYue/ۥۢ۠ۦ۠;->setThumbPosition(F)V

    return-void
.end method
