.class public LYue/ۥ۠۠ۦۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠ۦۤ;
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


# virtual methods
.method public ۥ(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z
    .locals 0
    .param p1    # Landroid/view/inputmethod/InputConnection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/text/Editable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p4    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param

    invoke-static {p1, p2, p3, p4, p5}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۤ(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z

    move-result p1

    return p1
.end method

.method public ۥ۟(Landroid/view/inputmethod/EditorInfo;)V
    .locals 1
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠۠()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟()Landroidx/emoji2/text/ۥ۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۥ(Landroid/view/inputmethod/EditorInfo;)V

    :cond_0
    return-void
.end method
