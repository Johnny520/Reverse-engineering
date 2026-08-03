.class public La/Vg;
.super La/Ug;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Vg$a;
    }
.end annotation


# static fields
.field public static g:Z = true


# virtual methods
.method public c(Landroid/view/View;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, La/Sg;->c(Landroid/view/View;I)V

    return-void

    :cond_0
    sget-boolean v0, La/Vg;->g:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, La/Vg$a;->a(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, La/Vg;->g:Z

    :cond_1
    return-void
.end method
