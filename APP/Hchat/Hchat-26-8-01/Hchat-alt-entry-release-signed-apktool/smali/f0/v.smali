.class public final Lf0/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/inputmethod/InputConnection;


# instance fields
.field public final a:Landroidx/lifecycle/x;

.field public final b:Z

.field public final c:Lw/q0;

.field public final d:Lh0/d1;

.field public final e:Ly1/l2;

.field public f:I

.field public g:Ln2/s;

.field public h:I

.field public i:Z

.field public final j:Ljava/util/ArrayList;

.field public k:Z


# direct methods
.method public constructor <init>(Ln2/s;Landroidx/lifecycle/x;ZLw/q0;Lh0/d1;Ly1/l2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lf0/v;->a:Landroidx/lifecycle/x;

    .line 5
    .line 6
    iput-boolean p3, p0, Lf0/v;->b:Z

    .line 7
    .line 8
    iput-object p4, p0, Lf0/v;->c:Lw/q0;

    .line 9
    .line 10
    iput-object p5, p0, Lf0/v;->d:Lh0/d1;

    .line 11
    .line 12
    iput-object p6, p0, Lf0/v;->e:Ly1/l2;

    .line 13
    .line 14
    iput-object p1, p0, Lf0/v;->g:Ln2/s;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lf0/v;->j:Ljava/util/ArrayList;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lf0/v;->k:Z

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Ln2/g;)V
    .locals 1

    .line 1
    iget v0, p0, Lf0/v;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lf0/v;->f:I

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lf0/v;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lf0/v;->b()Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    invoke-virtual {p0}, Lf0/v;->b()Z

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public final b()Z
    .locals 3

    .line 1
    iget v0, p0, Lf0/v;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lf0/v;->f:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lf0/v;->j:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lf0/v;->a:Landroidx/lifecycle/x;

    .line 23
    .line 24
    iget-object v2, v2, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lf0/u;

    .line 27
    .line 28
    iget-object v2, v2, Lf0/u;->c:Lfg/l;

    .line 29
    .line 30
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget v0, p0, Lf0/v;->f:I

    .line 37
    .line 38
    if-lez v0, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    return v0

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    return v0
.end method

.method public final beginBatchEdit()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lf0/v;->f:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    add-int/2addr v0, v1

    .line 9
    iput v0, p0, Lf0/v;->f:I

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    return v0
.end method

.method public final c(I)V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/KeyEvent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lf0/v;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/view/KeyEvent;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lf0/v;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final clearMetaKeyStates(I)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    return p1
.end method

.method public final closeConnection()V
    .locals 4

    .line 1
    iget-object v0, p0, Lf0/v;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lf0/v;->f:I

    .line 8
    .line 9
    iput-boolean v0, p0, Lf0/v;->k:Z

    .line 10
    .line 11
    iget-object v1, p0, Lf0/v;->a:Landroidx/lifecycle/x;

    .line 12
    .line 13
    iget-object v1, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lf0/u;

    .line 16
    .line 17
    iget-object v1, v1, Lf0/u;->j:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    :goto_0
    if-ge v0, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public final commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    return p1
.end method

.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    return p1
.end method

.method public final commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Lf0/v;->b:Z

    .line 6
    .line 7
    :cond_0
    return p1
.end method

.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ln2/a;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, p1, p2}, Ln2/a;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lf0/v;->a(Ln2/g;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return v0
.end method

.method public final deleteSurroundingText(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ln2/e;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Ln2/e;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lf0/v;->a(Ln2/g;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    return v0
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ln2/f;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Ln2/f;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lf0/v;->a(Ln2/g;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    return v0
.end method

.method public final endBatchEdit()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf0/v;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final finishComposingText()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ln2/h;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lf0/v;->a(Ln2/g;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    :cond_0
    return v0
.end method

.method public final getCursorCapsMode(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lf0/v;->g:Ln2/s;

    .line 2
    .line 3
    iget-object v1, v0, Ln2/s;->a:Li2/g;

    .line 4
    .line 5
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v2, v0, Ln2/s;->b:J

    .line 8
    .line 9
    invoke-static {v2, v3}, Li2/m0;->f(J)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v1, v0, p1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v0, v1

    .line 8
    :goto_0
    iput-boolean v0, p0, Lf0/v;->i:Z

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget v1, p1, Landroid/view/inputmethod/ExtractedTextRequest;->token:I

    .line 15
    .line 16
    :cond_1
    iput v1, p0, Lf0/v;->h:I

    .line 17
    .line 18
    :cond_2
    iget-object p1, p0, Lf0/v;->g:Ln2/s;

    .line 19
    .line 20
    invoke-static {p1}, Lf0/q;->d(Ln2/s;)Landroid/view/inputmethod/ExtractedText;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final getSelectedText(I)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object p1, p0, Lf0/v;->g:Ln2/s;

    .line 2
    .line 3
    iget-wide v0, p1, Ln2/s;->b:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    iget-object p1, p0, Lf0/v;->g:Ln2/s;

    .line 14
    .line 15
    invoke-static {p1}, Lig/a;->z(Ln2/s;)Li2/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 20
    .line 21
    return-object p1
.end method

.method public final getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p2, p0, Lf0/v;->g:Ln2/s;

    .line 2
    .line 3
    invoke-static {p2, p1}, Lig/a;->B(Ln2/s;I)Li2/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
.end method

.method public final getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p2, p0, Lf0/v;->g:Ln2/s;

    .line 2
    .line 3
    invoke-static {p2, p1}, Lig/a;->C(Ln2/s;I)Li2/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
.end method

.method public final performContextMenuAction(I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return v0

    .line 10
    :pswitch_0
    const/16 p1, 0x117

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lf0/v;->c(I)V

    .line 13
    .line 14
    .line 15
    return v0

    .line 16
    :pswitch_1
    const/16 p1, 0x116

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lf0/v;->c(I)V

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :pswitch_2
    const/16 p1, 0x115

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lf0/v;->c(I)V

    .line 25
    .line 26
    .line 27
    return v0

    .line 28
    :pswitch_3
    new-instance p1, Ln2/r;

    .line 29
    .line 30
    iget-object v1, p0, Lf0/v;->g:Ln2/s;

    .line 31
    .line 32
    iget-object v1, v1, Ln2/s;->a:Li2/g;

    .line 33
    .line 34
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-direct {p1, v0, v1}, Ln2/r;-><init>(II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lf0/v;->a(Ln2/g;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x102001f
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final performEditorAction(I)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "IME sends unsupported Editor Action: "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "RecordingIC"

    .line 26
    .line 27
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    move p1, v0

    .line 31
    goto :goto_0

    .line 32
    :pswitch_0
    const/4 p1, 0x5

    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    const/4 p1, 0x7

    .line 35
    goto :goto_0

    .line 36
    :pswitch_2
    const/4 p1, 0x6

    .line 37
    goto :goto_0

    .line 38
    :pswitch_3
    const/4 p1, 0x4

    .line 39
    goto :goto_0

    .line 40
    :pswitch_4
    const/4 p1, 0x3

    .line 41
    goto :goto_0

    .line 42
    :pswitch_5
    const/4 p1, 0x2

    .line 43
    :goto_0
    iget-object v1, p0, Lf0/v;->a:Landroidx/lifecycle/x;

    .line 44
    .line 45
    iget-object v1, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lf0/u;

    .line 48
    .line 49
    iget-object v1, v1, Lf0/u;->d:Lfg/l;

    .line 50
    .line 51
    new-instance v2, Ln2/i;

    .line 52
    .line 53
    invoke-direct {v2, p1}, Ln2/i;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    return v0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    if-lt v3, v4, :cond_2c

    .line 12
    .line 13
    new-instance v3, Lb0/d0;

    .line 14
    .line 15
    const/16 v4, 0xc

    .line 16
    .line 17
    invoke-direct {v3, v0, v4}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    iget-object v5, v0, Lf0/v;->c:Lw/q0;

    .line 22
    .line 23
    const/4 v6, 0x3

    .line 24
    if-eqz v5, :cond_29

    .line 25
    .line 26
    iget-object v7, v5, Lw/q0;->j:Li2/g;

    .line 27
    .line 28
    if-nez v7, :cond_0

    .line 29
    .line 30
    goto/16 :goto_11

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v5}, Lw/q0;->d()Lw/m1;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    const/4 v9, 0x0

    .line 37
    if-eqz v8, :cond_1

    .line 38
    .line 39
    iget-object v8, v8, Lw/m1;->a:Li2/k0;

    .line 40
    .line 41
    iget-object v8, v8, Li2/k0;->a:Li2/j0;

    .line 42
    .line 43
    if-eqz v8, :cond_1

    .line 44
    .line 45
    iget-object v8, v8, Li2/j0;->a:Li2/g;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v8, v9

    .line 49
    :goto_0
    invoke-virtual {v7, v8}, Li2/g;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-nez v8, :cond_2

    .line 54
    .line 55
    goto/16 :goto_11

    .line 56
    .line 57
    :cond_2
    invoke-static/range {p1 .. p1}, Lb0/a0;->q(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    const-wide v10, 0xffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    const/16 v8, 0x20

    .line 67
    .line 68
    const/4 v12, 0x1

    .line 69
    iget-object v13, v0, Lf0/v;->d:Lh0/d1;

    .line 70
    .line 71
    if-eqz v6, :cond_6

    .line 72
    .line 73
    invoke-static/range {p1 .. p1}, Lb0/a0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-static {v6}, Lf0/k;->l(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-static {v7}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v6}, Lf0/k;->e(Landroid/view/inputmethod/SelectGesture;)I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-eq v9, v12, :cond_3

    .line 90
    .line 91
    move v9, v4

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move v9, v12

    .line 94
    :goto_1
    invoke-static {v5, v7, v9}, Lf0/q;->i(Lw/q0;Le1/c;I)J

    .line 95
    .line 96
    .line 97
    move-result-wide v14

    .line 98
    invoke-static {v14, v15}, Li2/m0;->c(J)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_4

    .line 103
    .line 104
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-static {v5, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    goto/16 :goto_11

    .line 113
    .line 114
    :cond_4
    new-instance v5, Ln2/r;

    .line 115
    .line 116
    shr-long v6, v14, v8

    .line 117
    .line 118
    long-to-int v6, v6

    .line 119
    and-long v7, v14, v10

    .line 120
    .line 121
    long-to-int v7, v7

    .line 122
    invoke-direct {v5, v6, v7}, Ln2/r;-><init>(II)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v5}, Lb0/d0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    if-eqz v13, :cond_5

    .line 129
    .line 130
    invoke-virtual {v13, v12}, Lh0/d1;->h(Z)V

    .line 131
    .line 132
    .line 133
    :cond_5
    :goto_2
    move v6, v12

    .line 134
    goto/16 :goto_11

    .line 135
    .line 136
    :cond_6
    invoke-static/range {p1 .. p1}, Lb0/a0;->x(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_a

    .line 141
    .line 142
    invoke-static/range {p1 .. p1}, Lb0/a0;->d(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-static {v6}, Lf0/k;->c(Landroid/view/inputmethod/DeleteGesture;)I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eq v8, v12, :cond_7

    .line 151
    .line 152
    move v8, v4

    .line 153
    goto :goto_3

    .line 154
    :cond_7
    move v8, v12

    .line 155
    :goto_3
    invoke-static {v6}, Lf0/k;->j(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-static {v9}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-static {v5, v9, v8}, Lf0/q;->i(Lw/q0;Le1/c;I)J

    .line 164
    .line 165
    .line 166
    move-result-wide v9

    .line 167
    invoke-static {v9, v10}, Li2/m0;->c(J)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_8

    .line 172
    .line 173
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-static {v5, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    goto/16 :goto_11

    .line 182
    .line 183
    :cond_8
    if-ne v8, v12, :cond_9

    .line 184
    .line 185
    move v5, v12

    .line 186
    goto :goto_4

    .line 187
    :cond_9
    move v5, v4

    .line 188
    :goto_4
    invoke-static {v9, v10, v7, v5, v3}, Lf0/q;->n(JLi2/g;ZLb0/d0;)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_a
    invoke-static/range {p1 .. p1}, Lb0/a0;->z(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    if-eqz v6, :cond_d

    .line 197
    .line 198
    invoke-static/range {p1 .. p1}, Lb0/a0;->k(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-static {v6}, Lb0/a0;->c(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-static {v7}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-static {v6}, Lb0/a0;->r(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    invoke-static {v9}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-static {v6}, Lf0/k;->f(Landroid/view/inputmethod/SelectRangeGesture;)I

    .line 219
    .line 220
    .line 221
    move-result v14

    .line 222
    if-eq v14, v12, :cond_b

    .line 223
    .line 224
    move v14, v4

    .line 225
    goto :goto_5

    .line 226
    :cond_b
    move v14, v12

    .line 227
    :goto_5
    invoke-static {v5, v7, v9, v14}, Lf0/q;->b(Lw/q0;Le1/c;Le1/c;I)J

    .line 228
    .line 229
    .line 230
    move-result-wide v14

    .line 231
    invoke-static {v14, v15}, Li2/m0;->c(J)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-eqz v5, :cond_c

    .line 236
    .line 237
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-static {v5, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    goto/16 :goto_11

    .line 246
    .line 247
    :cond_c
    new-instance v5, Ln2/r;

    .line 248
    .line 249
    shr-long v6, v14, v8

    .line 250
    .line 251
    long-to-int v6, v6

    .line 252
    and-long v7, v14, v10

    .line 253
    .line 254
    long-to-int v7, v7

    .line 255
    invoke-direct {v5, v6, v7}, Ln2/r;-><init>(II)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v5}, Lb0/d0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    if-eqz v13, :cond_5

    .line 262
    .line 263
    invoke-virtual {v13, v12}, Lh0/d1;->h(Z)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_2

    .line 267
    .line 268
    :cond_d
    invoke-static/range {p1 .. p1}, Lb0/a0;->B(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-eqz v6, :cond_11

    .line 273
    .line 274
    invoke-static/range {p1 .. p1}, Lb0/a0;->e(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-static {v6}, Lf0/k;->d(Landroid/view/inputmethod/DeleteRangeGesture;)I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    if-eq v8, v12, :cond_e

    .line 283
    .line 284
    move v8, v4

    .line 285
    goto :goto_6

    .line 286
    :cond_e
    move v8, v12

    .line 287
    :goto_6
    invoke-static {v6}, Lf0/k;->k(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-static {v9}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-static {v6}, Lf0/k;->v(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 296
    .line 297
    .line 298
    move-result-object v10

    .line 299
    invoke-static {v10}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-static {v5, v9, v10, v8}, Lf0/q;->b(Lw/q0;Le1/c;Le1/c;I)J

    .line 304
    .line 305
    .line 306
    move-result-wide v9

    .line 307
    invoke-static {v9, v10}, Li2/m0;->c(J)Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    if-eqz v5, :cond_f

    .line 312
    .line 313
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    invoke-static {v5, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    goto/16 :goto_11

    .line 322
    .line 323
    :cond_f
    if-ne v8, v12, :cond_10

    .line 324
    .line 325
    move v5, v12

    .line 326
    goto :goto_7

    .line 327
    :cond_10
    move v5, v4

    .line 328
    :goto_7
    invoke-static {v9, v10, v7, v5, v3}, Lf0/q;->n(JLi2/g;ZLb0/d0;)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_2

    .line 332
    .line 333
    :cond_11
    invoke-static/range {p1 .. p1}, Lb0/a0;->D(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    const/4 v10, 0x2

    .line 338
    iget-object v11, v0, Lf0/v;->e:Ly1/l2;

    .line 339
    .line 340
    const/4 v13, -0x1

    .line 341
    if-eqz v6, :cond_1a

    .line 342
    .line 343
    invoke-static/range {p1 .. p1}, Lb0/a0;->h(Ljava/lang/Object;)Landroid/view/inputmethod/JoinOrSplitGesture;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    if-nez v11, :cond_12

    .line 348
    .line 349
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    invoke-static {v5, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    goto/16 :goto_11

    .line 358
    .line 359
    :cond_12
    invoke-static {v6}, Lf0/k;->h(Landroid/view/inputmethod/JoinOrSplitGesture;)Landroid/graphics/PointF;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    invoke-static {v9}, Lf0/q;->e(Landroid/graphics/PointF;)J

    .line 364
    .line 365
    .line 366
    move-result-wide v14

    .line 367
    invoke-static {v5, v14, v15, v11}, Lf0/q;->a(Lw/q0;JLy1/l2;)I

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    if-eq v9, v13, :cond_19

    .line 372
    .line 373
    invoke-virtual {v5}, Lw/q0;->d()Lw/m1;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    if-eqz v5, :cond_13

    .line 378
    .line 379
    iget-object v5, v5, Lw/m1;->a:Li2/k0;

    .line 380
    .line 381
    invoke-static {v5, v9}, Lf0/q;->c(Li2/k0;I)Z

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    if-ne v5, v12, :cond_13

    .line 386
    .line 387
    goto :goto_b

    .line 388
    :cond_13
    move v5, v9

    .line 389
    :goto_8
    if-lez v5, :cond_15

    .line 390
    .line 391
    invoke-static {v7, v5}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    invoke-static {v6}, Lf0/q;->k(I)Z

    .line 396
    .line 397
    .line 398
    move-result v11

    .line 399
    if-nez v11, :cond_14

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_14
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    sub-int/2addr v5, v6

    .line 407
    goto :goto_8

    .line 408
    :cond_15
    :goto_9
    iget-object v6, v7, Li2/g;->h:Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    if-ge v9, v6, :cond_17

    .line 415
    .line 416
    invoke-static {v7, v9}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 417
    .line 418
    .line 419
    move-result v6

    .line 420
    invoke-static {v6}, Lf0/q;->k(I)Z

    .line 421
    .line 422
    .line 423
    move-result v11

    .line 424
    if-nez v11, :cond_16

    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_16
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 428
    .line 429
    .line 430
    move-result v6

    .line 431
    add-int/2addr v9, v6

    .line 432
    goto :goto_9

    .line 433
    :cond_17
    :goto_a
    invoke-static {v5, v9}, Li2/e0;->b(II)J

    .line 434
    .line 435
    .line 436
    move-result-wide v5

    .line 437
    invoke-static {v5, v6}, Li2/m0;->c(J)Z

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    if-eqz v9, :cond_18

    .line 442
    .line 443
    shr-long/2addr v5, v8

    .line 444
    long-to-int v5, v5

    .line 445
    new-instance v6, Ln2/r;

    .line 446
    .line 447
    invoke-direct {v6, v5, v5}, Ln2/r;-><init>(II)V

    .line 448
    .line 449
    .line 450
    new-instance v5, Ln2/a;

    .line 451
    .line 452
    const-string v7, " "

    .line 453
    .line 454
    invoke-direct {v5, v7, v12}, Ln2/a;-><init>(Ljava/lang/String;I)V

    .line 455
    .line 456
    .line 457
    new-array v7, v10, [Ln2/g;

    .line 458
    .line 459
    aput-object v6, v7, v4

    .line 460
    .line 461
    aput-object v5, v7, v12

    .line 462
    .line 463
    new-instance v5, Lf0/m;

    .line 464
    .line 465
    invoke-direct {v5, v7}, Lf0/m;-><init>([Ln2/g;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3, v5}, Lb0/d0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    goto/16 :goto_2

    .line 472
    .line 473
    :cond_18
    invoke-static {v5, v6, v7, v4, v3}, Lf0/q;->n(JLi2/g;ZLb0/d0;)V

    .line 474
    .line 475
    .line 476
    goto/16 :goto_2

    .line 477
    .line 478
    :cond_19
    :goto_b
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-static {v5, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 483
    .line 484
    .line 485
    move-result v6

    .line 486
    goto/16 :goto_11

    .line 487
    .line 488
    :cond_1a
    invoke-static/range {p1 .. p1}, Lb0/a0;->t(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v6

    .line 492
    if-eqz v6, :cond_1e

    .line 493
    .line 494
    invoke-static/range {p1 .. p1}, Lb0/a0;->g(Ljava/lang/Object;)Landroid/view/inputmethod/InsertGesture;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    if-nez v11, :cond_1b

    .line 499
    .line 500
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    invoke-static {v5, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 505
    .line 506
    .line 507
    move-result v6

    .line 508
    goto/16 :goto_11

    .line 509
    .line 510
    :cond_1b
    invoke-static {v6}, Lb0/a0;->b(Landroid/view/inputmethod/InsertGesture;)Landroid/graphics/PointF;

    .line 511
    .line 512
    .line 513
    move-result-object v7

    .line 514
    invoke-static {v7}, Lf0/q;->e(Landroid/graphics/PointF;)J

    .line 515
    .line 516
    .line 517
    move-result-wide v7

    .line 518
    invoke-static {v5, v7, v8, v11}, Lf0/q;->a(Lw/q0;JLy1/l2;)I

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    if-eq v7, v13, :cond_1d

    .line 523
    .line 524
    invoke-virtual {v5}, Lw/q0;->d()Lw/m1;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    if-eqz v5, :cond_1c

    .line 529
    .line 530
    iget-object v5, v5, Lw/m1;->a:Li2/k0;

    .line 531
    .line 532
    invoke-static {v5, v7}, Lf0/q;->c(Li2/k0;I)Z

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    if-ne v5, v12, :cond_1c

    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_1c
    invoke-static {v6}, Lf0/k;->p(Landroid/view/inputmethod/InsertGesture;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    new-instance v6, Ln2/r;

    .line 544
    .line 545
    invoke-direct {v6, v7, v7}, Ln2/r;-><init>(II)V

    .line 546
    .line 547
    .line 548
    new-instance v7, Ln2/a;

    .line 549
    .line 550
    invoke-direct {v7, v5, v12}, Ln2/a;-><init>(Ljava/lang/String;I)V

    .line 551
    .line 552
    .line 553
    new-array v5, v10, [Ln2/g;

    .line 554
    .line 555
    aput-object v6, v5, v4

    .line 556
    .line 557
    aput-object v7, v5, v12

    .line 558
    .line 559
    new-instance v6, Lf0/m;

    .line 560
    .line 561
    invoke-direct {v6, v5}, Lf0/m;-><init>([Ln2/g;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v3, v6}, Lb0/d0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    goto/16 :goto_2

    .line 568
    .line 569
    :cond_1d
    :goto_c
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    invoke-static {v5, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    goto/16 :goto_11

    .line 578
    .line 579
    :cond_1e
    invoke-static/range {p1 .. p1}, Lb0/a0;->v(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v6

    .line 583
    if-eqz v6, :cond_28

    .line 584
    .line 585
    invoke-static/range {p1 .. p1}, Lb0/a0;->i(Ljava/lang/Object;)Landroid/view/inputmethod/RemoveSpaceGesture;

    .line 586
    .line 587
    .line 588
    move-result-object v6

    .line 589
    invoke-virtual {v5}, Lw/q0;->d()Lw/m1;

    .line 590
    .line 591
    .line 592
    move-result-object v14

    .line 593
    if-eqz v14, :cond_1f

    .line 594
    .line 595
    iget-object v9, v14, Lw/m1;->a:Li2/k0;

    .line 596
    .line 597
    :cond_1f
    invoke-static {v6}, Lf0/k;->i(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    .line 598
    .line 599
    .line 600
    move-result-object v14

    .line 601
    invoke-static {v14}, Lf0/q;->e(Landroid/graphics/PointF;)J

    .line 602
    .line 603
    .line 604
    move-result-wide v14

    .line 605
    invoke-static {v6}, Lf0/k;->u(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    .line 606
    .line 607
    .line 608
    move-result-object v16

    .line 609
    move-object/from16 v18, v5

    .line 610
    .line 611
    invoke-static/range {v16 .. v16}, Lf0/q;->e(Landroid/graphics/PointF;)J

    .line 612
    .line 613
    .line 614
    move-result-wide v4

    .line 615
    move/from16 v16, v8

    .line 616
    .line 617
    invoke-virtual/range {v18 .. v18}, Lw/q0;->c()Lv1/t;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    if-eqz v9, :cond_24

    .line 622
    .line 623
    iget-object v9, v9, Li2/k0;->b:Li2/o;

    .line 624
    .line 625
    if-nez v8, :cond_20

    .line 626
    .line 627
    goto :goto_e

    .line 628
    :cond_20
    invoke-interface {v8, v14, v15}, Lv1/t;->j0(J)J

    .line 629
    .line 630
    .line 631
    move-result-wide v14

    .line 632
    invoke-interface {v8, v4, v5}, Lv1/t;->j0(J)J

    .line 633
    .line 634
    .line 635
    move-result-wide v4

    .line 636
    invoke-static {v9, v14, v15, v11}, Lf0/q;->h(Li2/o;JLy1/l2;)I

    .line 637
    .line 638
    .line 639
    move-result v8

    .line 640
    invoke-static {v9, v4, v5, v11}, Lf0/q;->h(Li2/o;JLy1/l2;)I

    .line 641
    .line 642
    .line 643
    move-result v11

    .line 644
    if-ne v8, v13, :cond_21

    .line 645
    .line 646
    if-ne v11, v13, :cond_23

    .line 647
    .line 648
    sget-wide v4, Li2/m0;->b:J

    .line 649
    .line 650
    goto :goto_f

    .line 651
    :cond_21
    if-ne v11, v13, :cond_22

    .line 652
    .line 653
    goto :goto_d

    .line 654
    :cond_22
    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    .line 655
    .line 656
    .line 657
    move-result v8

    .line 658
    :goto_d
    move v11, v8

    .line 659
    :cond_23
    invoke-virtual {v9, v11}, Li2/o;->f(I)F

    .line 660
    .line 661
    .line 662
    move-result v8

    .line 663
    invoke-virtual {v9, v11}, Li2/o;->b(I)F

    .line 664
    .line 665
    .line 666
    move-result v11

    .line 667
    add-float/2addr v11, v8

    .line 668
    int-to-float v8, v10

    .line 669
    div-float/2addr v11, v8

    .line 670
    new-instance v8, Le1/c;

    .line 671
    .line 672
    shr-long v14, v14, v16

    .line 673
    .line 674
    long-to-int v14, v14

    .line 675
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 676
    .line 677
    .line 678
    move-result v15

    .line 679
    shr-long v4, v4, v16

    .line 680
    .line 681
    long-to-int v4, v4

    .line 682
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 683
    .line 684
    .line 685
    move-result v5

    .line 686
    invoke-static {v15, v5}, Ljava/lang/Math;->min(FF)F

    .line 687
    .line 688
    .line 689
    move-result v5

    .line 690
    const p1, 0x3dcccccd    # 0.1f

    .line 691
    .line 692
    .line 693
    sub-float v15, v11, p1

    .line 694
    .line 695
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 696
    .line 697
    .line 698
    move-result v14

    .line 699
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 700
    .line 701
    .line 702
    move-result v4

    .line 703
    invoke-static {v14, v4}, Ljava/lang/Math;->max(FF)F

    .line 704
    .line 705
    .line 706
    move-result v4

    .line 707
    add-float v11, v11, p1

    .line 708
    .line 709
    invoke-direct {v8, v5, v15, v4, v11}, Le1/c;-><init>(FFFF)V

    .line 710
    .line 711
    .line 712
    sget-object v4, Li2/i0;->a:Lg1/d;

    .line 713
    .line 714
    const/4 v5, 0x0

    .line 715
    invoke-virtual {v9, v8, v5, v4}, Li2/o;->h(Le1/c;ILg1/d;)J

    .line 716
    .line 717
    .line 718
    move-result-wide v8

    .line 719
    move-wide v4, v8

    .line 720
    goto :goto_f

    .line 721
    :cond_24
    :goto_e
    sget-wide v4, Li2/m0;->b:J

    .line 722
    .line 723
    :goto_f
    invoke-static {v4, v5}, Li2/m0;->c(J)Z

    .line 724
    .line 725
    .line 726
    move-result v8

    .line 727
    if-eqz v8, :cond_25

    .line 728
    .line 729
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 730
    .line 731
    .line 732
    move-result-object v4

    .line 733
    invoke-static {v4, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 734
    .line 735
    .line 736
    move-result v6

    .line 737
    goto :goto_11

    .line 738
    :cond_25
    new-instance v8, Lgg/s;

    .line 739
    .line 740
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 741
    .line 742
    .line 743
    iput v13, v8, Lgg/s;->g:I

    .line 744
    .line 745
    new-instance v9, Lgg/s;

    .line 746
    .line 747
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 748
    .line 749
    .line 750
    iput v13, v9, Lgg/s;->g:I

    .line 751
    .line 752
    invoke-static {v4, v5}, Li2/m0;->f(J)I

    .line 753
    .line 754
    .line 755
    move-result v11

    .line 756
    invoke-static {v4, v5}, Li2/m0;->e(J)I

    .line 757
    .line 758
    .line 759
    move-result v14

    .line 760
    invoke-virtual {v7, v11, v14}, Li2/g;->b(II)Li2/g;

    .line 761
    .line 762
    .line 763
    move-result-object v7

    .line 764
    iget-object v7, v7, Li2/g;->h:Ljava/lang/String;

    .line 765
    .line 766
    new-instance v11, Log/k;

    .line 767
    .line 768
    const-string v14, "\\s+"

    .line 769
    .line 770
    invoke-direct {v11, v14}, Log/k;-><init>(Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    new-instance v14, Lf0/l;

    .line 774
    .line 775
    const/4 v15, 0x0

    .line 776
    invoke-direct {v14, v8, v9, v15}, Lf0/l;-><init>(Lgg/s;Lgg/s;I)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v11, v7, v14}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v7

    .line 783
    iget v8, v8, Lgg/s;->g:I

    .line 784
    .line 785
    if-eq v8, v13, :cond_27

    .line 786
    .line 787
    iget v11, v9, Lgg/s;->g:I

    .line 788
    .line 789
    if-ne v11, v13, :cond_26

    .line 790
    .line 791
    goto :goto_10

    .line 792
    :cond_26
    shr-long v13, v4, v16

    .line 793
    .line 794
    long-to-int v6, v13

    .line 795
    add-int v13, v6, v8

    .line 796
    .line 797
    add-int/2addr v6, v11

    .line 798
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 799
    .line 800
    .line 801
    move-result v11

    .line 802
    invoke-static {v4, v5}, Li2/m0;->d(J)I

    .line 803
    .line 804
    .line 805
    move-result v4

    .line 806
    iget v5, v9, Lgg/s;->g:I

    .line 807
    .line 808
    sub-int/2addr v4, v5

    .line 809
    sub-int/2addr v11, v4

    .line 810
    invoke-virtual {v7, v8, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v4

    .line 814
    new-instance v5, Ln2/r;

    .line 815
    .line 816
    invoke-direct {v5, v13, v6}, Ln2/r;-><init>(II)V

    .line 817
    .line 818
    .line 819
    new-instance v6, Ln2/a;

    .line 820
    .line 821
    invoke-direct {v6, v4, v12}, Ln2/a;-><init>(Ljava/lang/String;I)V

    .line 822
    .line 823
    .line 824
    new-array v4, v10, [Ln2/g;

    .line 825
    .line 826
    const/16 v17, 0x0

    .line 827
    .line 828
    aput-object v5, v4, v17

    .line 829
    .line 830
    aput-object v6, v4, v12

    .line 831
    .line 832
    new-instance v5, Lf0/m;

    .line 833
    .line 834
    invoke-direct {v5, v4}, Lf0/m;-><init>([Ln2/g;)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v3, v5}, Lb0/d0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    goto/16 :goto_2

    .line 841
    .line 842
    :cond_27
    :goto_10
    invoke-static {v6}, Lb0/a0;->f(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-static {v4, v3}, Lf0/q;->g(Landroid/view/inputmethod/HandwritingGesture;Lb0/d0;)I

    .line 847
    .line 848
    .line 849
    move-result v6

    .line 850
    goto :goto_11

    .line 851
    :cond_28
    move v6, v10

    .line 852
    :cond_29
    :goto_11
    if-nez v2, :cond_2a

    .line 853
    .line 854
    goto :goto_12

    .line 855
    :cond_2a
    if-eqz v1, :cond_2b

    .line 856
    .line 857
    new-instance v3, Lf0/d;

    .line 858
    .line 859
    const/4 v15, 0x0

    .line 860
    invoke-direct {v3, v6, v15, v2}, Lf0/d;-><init>(IILjava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 864
    .line 865
    .line 866
    return-void

    .line 867
    :cond_2b
    invoke-interface {v2, v6}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 868
    .line 869
    .line 870
    :cond_2c
    :goto_12
    return-void
.end method

.method public final performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    :cond_0
    return p1
.end method

.method public final previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_14

    .line 7
    .line 8
    iget-object v0, p0, Lf0/v;->c:Lw/q0;

    .line 9
    .line 10
    if-eqz v0, :cond_14

    .line 11
    .line 12
    iget-object v1, v0, Lw/q0;->j:Li2/g;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, Lw/q0;->d()Lw/m1;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iget-object v3, v3, Lw/m1;->a:Li2/k0;

    .line 25
    .line 26
    iget-object v3, v3, Li2/k0;->a:Li2/j0;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    iget-object v3, v3, Li2/j0;->a:Li2/g;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x0

    .line 34
    :goto_0
    invoke-virtual {v1, v3}, Li2/g;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_2
    invoke-static {p1}, Lb0/a0;->q(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sget-object v3, Lw/h0;->g:Lw/h0;

    .line 47
    .line 48
    iget-object v4, p0, Lf0/v;->d:Lh0/d1;

    .line 49
    .line 50
    const/4 v5, 0x1

    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-static {p1}, Lb0/a0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz v4, :cond_12

    .line 58
    .line 59
    invoke-static {p1}, Lf0/k;->l(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {p1}, Lf0/k;->e(Landroid/view/inputmethod/SelectGesture;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eq p1, v5, :cond_3

    .line 72
    .line 73
    move p1, v2

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move p1, v5

    .line 76
    :goto_1
    invoke-static {v0, v1, p1}, Lf0/q;->i(Lw/q0;Le1/c;I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iget-object p1, v4, Lh0/d1;->d:Lw/q0;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1, v0, v1}, Lw/q0;->f(J)V

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object p1, v4, Lh0/d1;->d:Lw/q0;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    sget-wide v6, Li2/m0;->b:J

    .line 92
    .line 93
    invoke-virtual {p1, v6, v7}, Lw/q0;->e(J)V

    .line 94
    .line 95
    .line 96
    :cond_5
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_12

    .line 101
    .line 102
    invoke-virtual {v4, v2}, Lh0/d1;->t(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v3}, Lh0/d1;->q(Lw/h0;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :cond_6
    invoke-static {p1}, Lb0/a0;->x(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_a

    .line 115
    .line 116
    invoke-static {p1}, Lb0/a0;->d(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz v4, :cond_12

    .line 121
    .line 122
    invoke-static {p1}, Lf0/k;->j(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v1}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {p1}, Lf0/k;->c(Landroid/view/inputmethod/DeleteGesture;)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eq p1, v5, :cond_7

    .line 135
    .line 136
    move p1, v2

    .line 137
    goto :goto_2

    .line 138
    :cond_7
    move p1, v5

    .line 139
    :goto_2
    invoke-static {v0, v1, p1}, Lf0/q;->i(Lw/q0;Le1/c;I)J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    iget-object p1, v4, Lh0/d1;->d:Lw/q0;

    .line 144
    .line 145
    if-eqz p1, :cond_8

    .line 146
    .line 147
    invoke-virtual {p1, v0, v1}, Lw/q0;->e(J)V

    .line 148
    .line 149
    .line 150
    :cond_8
    iget-object p1, v4, Lh0/d1;->d:Lw/q0;

    .line 151
    .line 152
    if-eqz p1, :cond_9

    .line 153
    .line 154
    sget-wide v6, Li2/m0;->b:J

    .line 155
    .line 156
    invoke-virtual {p1, v6, v7}, Lw/q0;->f(J)V

    .line 157
    .line 158
    .line 159
    :cond_9
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_12

    .line 164
    .line 165
    invoke-virtual {v4, v2}, Lh0/d1;->t(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v3}, Lh0/d1;->q(Lw/h0;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :cond_a
    invoke-static {p1}, Lb0/a0;->z(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_e

    .line 178
    .line 179
    invoke-static {p1}, Lb0/a0;->k(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-eqz v4, :cond_12

    .line 184
    .line 185
    invoke-static {p1}, Lb0/a0;->c(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {p1}, Lb0/a0;->r(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-static {v6}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-static {p1}, Lf0/k;->f(Landroid/view/inputmethod/SelectRangeGesture;)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eq p1, v5, :cond_b

    .line 206
    .line 207
    move p1, v2

    .line 208
    goto :goto_3

    .line 209
    :cond_b
    move p1, v5

    .line 210
    :goto_3
    invoke-static {v0, v1, v6, p1}, Lf0/q;->b(Lw/q0;Le1/c;Le1/c;I)J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    iget-object p1, v4, Lh0/d1;->d:Lw/q0;

    .line 215
    .line 216
    if-eqz p1, :cond_c

    .line 217
    .line 218
    invoke-virtual {p1, v0, v1}, Lw/q0;->f(J)V

    .line 219
    .line 220
    .line 221
    :cond_c
    iget-object p1, v4, Lh0/d1;->d:Lw/q0;

    .line 222
    .line 223
    if-eqz p1, :cond_d

    .line 224
    .line 225
    sget-wide v6, Li2/m0;->b:J

    .line 226
    .line 227
    invoke-virtual {p1, v6, v7}, Lw/q0;->e(J)V

    .line 228
    .line 229
    .line 230
    :cond_d
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-nez p1, :cond_12

    .line 235
    .line 236
    invoke-virtual {v4, v2}, Lh0/d1;->t(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v3}, Lh0/d1;->q(Lw/h0;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_e
    invoke-static {p1}, Lb0/a0;->B(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_14

    .line 248
    .line 249
    invoke-static {p1}, Lb0/a0;->e(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    if-eqz v4, :cond_12

    .line 254
    .line 255
    invoke-static {p1}, Lf0/k;->k(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {v1}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {p1}, Lf0/k;->v(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    invoke-static {v6}, Lf1/c0;->y(Landroid/graphics/RectF;)Le1/c;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    invoke-static {p1}, Lf0/k;->d(Landroid/view/inputmethod/DeleteRangeGesture;)I

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-eq p1, v5, :cond_f

    .line 276
    .line 277
    move p1, v2

    .line 278
    goto :goto_4

    .line 279
    :cond_f
    move p1, v5

    .line 280
    :goto_4
    invoke-static {v0, v1, v6, p1}, Lf0/q;->b(Lw/q0;Le1/c;Le1/c;I)J

    .line 281
    .line 282
    .line 283
    move-result-wide v0

    .line 284
    iget-object p1, v4, Lh0/d1;->d:Lw/q0;

    .line 285
    .line 286
    if-eqz p1, :cond_10

    .line 287
    .line 288
    invoke-virtual {p1, v0, v1}, Lw/q0;->e(J)V

    .line 289
    .line 290
    .line 291
    :cond_10
    iget-object p1, v4, Lh0/d1;->d:Lw/q0;

    .line 292
    .line 293
    if-eqz p1, :cond_11

    .line 294
    .line 295
    sget-wide v6, Li2/m0;->b:J

    .line 296
    .line 297
    invoke-virtual {p1, v6, v7}, Lw/q0;->f(J)V

    .line 298
    .line 299
    .line 300
    :cond_11
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-nez p1, :cond_12

    .line 305
    .line 306
    invoke-virtual {v4, v2}, Lh0/d1;->t(Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v4, v3}, Lh0/d1;->q(Lw/h0;)V

    .line 310
    .line 311
    .line 312
    :cond_12
    :goto_5
    if-eqz p2, :cond_13

    .line 313
    .line 314
    new-instance p1, Le2/d;

    .line 315
    .line 316
    const/4 v0, 0x1

    .line 317
    invoke-direct {p1, v4, v0}, Le2/d;-><init>(Ljava/lang/Object;I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p2, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 321
    .line 322
    .line 323
    :cond_13
    return v5

    .line 324
    :cond_14
    :goto_6
    return v2
.end method

.method public final reportFullscreenMode(Z)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final requestCursorUpdates(I)Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    and-int/lit8 v0, p1, 0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move v0, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    and-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    move v3, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v3, v1

    .line 21
    :goto_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v5, 0x21

    .line 24
    .line 25
    if-lt v4, v5, :cond_8

    .line 26
    .line 27
    and-int/lit8 v5, p1, 0x10

    .line 28
    .line 29
    if-eqz v5, :cond_2

    .line 30
    .line 31
    move v5, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v5, v1

    .line 34
    :goto_2
    and-int/lit8 v6, p1, 0x8

    .line 35
    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    move v6, v2

    .line 39
    goto :goto_3

    .line 40
    :cond_3
    move v6, v1

    .line 41
    :goto_3
    and-int/lit8 v7, p1, 0x4

    .line 42
    .line 43
    if-eqz v7, :cond_4

    .line 44
    .line 45
    move v7, v2

    .line 46
    goto :goto_4

    .line 47
    :cond_4
    move v7, v1

    .line 48
    :goto_4
    const/16 v8, 0x22

    .line 49
    .line 50
    if-lt v4, v8, :cond_5

    .line 51
    .line 52
    and-int/lit8 p1, p1, 0x20

    .line 53
    .line 54
    if-eqz p1, :cond_5

    .line 55
    .line 56
    move v1, v2

    .line 57
    :cond_5
    if-nez v5, :cond_7

    .line 58
    .line 59
    if-nez v6, :cond_7

    .line 60
    .line 61
    if-nez v7, :cond_7

    .line 62
    .line 63
    if-nez v1, :cond_7

    .line 64
    .line 65
    if-lt v4, v8, :cond_6

    .line 66
    .line 67
    move p1, v2

    .line 68
    move v1, p1

    .line 69
    :goto_5
    move v5, v1

    .line 70
    :goto_6
    move v6, v5

    .line 71
    goto :goto_7

    .line 72
    :cond_6
    move p1, v1

    .line 73
    move v1, v2

    .line 74
    goto :goto_5

    .line 75
    :cond_7
    move p1, v1

    .line 76
    move v1, v7

    .line 77
    goto :goto_7

    .line 78
    :cond_8
    move p1, v1

    .line 79
    move v5, v2

    .line 80
    goto :goto_6

    .line 81
    :goto_7
    iget-object v4, p0, Lf0/v;->a:Landroidx/lifecycle/x;

    .line 82
    .line 83
    iget-object v4, v4, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v4, Lf0/u;

    .line 86
    .line 87
    iget-object v4, v4, Lf0/u;->m:Lf0/r;

    .line 88
    .line 89
    iget-object v7, v4, Lf0/r;->c:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v7

    .line 92
    :try_start_0
    iput-boolean v5, v4, Lf0/r;->f:Z

    .line 93
    .line 94
    iput-boolean v6, v4, Lf0/r;->g:Z

    .line 95
    .line 96
    iput-boolean v1, v4, Lf0/r;->h:Z

    .line 97
    .line 98
    iput-boolean p1, v4, Lf0/r;->i:Z

    .line 99
    .line 100
    if-eqz v0, :cond_9

    .line 101
    .line 102
    iput-boolean v2, v4, Lf0/r;->e:Z

    .line 103
    .line 104
    iget-object p1, v4, Lf0/r;->j:Ln2/s;

    .line 105
    .line 106
    if-eqz p1, :cond_9

    .line 107
    .line 108
    invoke-virtual {v4}, Lf0/r;->a()V

    .line 109
    .line 110
    .line 111
    goto :goto_8

    .line 112
    :catchall_0
    move-exception p1

    .line 113
    goto :goto_9

    .line 114
    :cond_9
    :goto_8
    iput-boolean v3, v4, Lf0/r;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    monitor-exit v7

    .line 117
    return v2

    .line 118
    :goto_9
    monitor-exit v7

    .line 119
    throw p1

    .line 120
    :cond_a
    return v0
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf0/v;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lf0/u;

    .line 10
    .line 11
    iget-object v0, v0, Lf0/u;->k:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    return v0
.end method

.method public final setComposingRegion(II)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ln2/p;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Ln2/p;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lf0/v;->a(Ln2/g;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return v0
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ln2/q;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, p1, p2}, Ln2/q;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lf0/v;->a(Ln2/g;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return v0
.end method

.method public final setSelection(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf0/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ln2/r;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Ln2/r;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lf0/v;->a(Ln2/g;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    return v0
.end method
