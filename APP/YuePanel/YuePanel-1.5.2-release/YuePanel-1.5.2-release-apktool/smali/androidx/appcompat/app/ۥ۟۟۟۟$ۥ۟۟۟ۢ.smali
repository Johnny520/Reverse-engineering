.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/app/ۥ۟$ۥ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۢ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۢ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۡ۟()Landroidx/appcompat/app/ۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ;->ۥ۟۟۠۟()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۢ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۦۢ()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۢ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۡ۟()Landroidx/appcompat/app/ۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ;->ۥۣ۟۟ۤ(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, p2}, Landroidx/appcompat/app/ۥ;->ۥ۟۟ۤ۠(I)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟()Landroid/graphics/drawable/Drawable;
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۢ;->ۥ۟()Landroid/content/Context;

    move-result-object v0

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠۠ۧ:I

    filled-new-array {v1}, [I

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۤ(Landroid/content/Context;Landroid/util/AttributeSet;[I)LYue/ۥۢۡۥۦ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۢ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    return-object v1
.end method

.method public ۥ۟۟۟۟(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۢ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۡ۟()Landroidx/appcompat/app/ۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ;->ۥ۟۟ۤ۠(I)V

    :cond_0
    return-void
.end method
