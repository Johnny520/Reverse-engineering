.class public LYue/ۥۣ۟ۡۧ$ۥ;
.super LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡۡ(Landroid/content/Context;LYue/ۥۢۡۥۦ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:I

.field public final synthetic ۥ۟:I

.field public final synthetic ۥ۟۟:Ljava/lang/ref/WeakReference;

.field public final synthetic ۥ۟۟۟:LYue/ۥۣ۟ۡۧ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۡۧ;IILjava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ$ۥ;->ۥ۟۟۟:LYue/ۥۣ۟ۡۧ;

    iput p2, p0, LYue/ۥۣ۟ۡۧ$ۥ;->ۥ:I

    iput p3, p0, LYue/ۥۣ۟ۡۧ$ۥ;->ۥ۟:I

    iput-object p4, p0, LYue/ۥۣ۟ۡۧ$ۥ;->ۥ۟۟:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;-><init>()V

    return-void
.end method


# virtual methods
.method public onFontRetrievalFailed(I)V
    .locals 0

    return-void
.end method

.method public onFontRetrieved(Landroid/graphics/Typeface;)V
    .locals 2
    .param p1    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    iget v0, p0, LYue/ۥۣ۟ۡۧ$ۥ;->ۥ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v1, p0, LYue/ۥۣ۟ۡۧ$ۥ;->ۥ۟:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1, v0, v1}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۠;->ۥ(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_1
    iget-object v0, p0, LYue/ۥۣ۟ۡۧ$ۥ;->ۥ۟۟۟:LYue/ۥۣ۟ۡۧ;

    iget-object v1, p0, LYue/ۥۣ۟ۡۧ$ۥ;->ۥ۟۟:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۨ(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V

    return-void
.end method
