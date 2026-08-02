.class public final Ll62;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/view/inputmethod/InputConnection;


# instance fields
.field public final a:Ln4;

.field public final b:Z

.field public final c:Lt91;

.field public final d:Lb03;

.field public final e:Lza3;

.field public f:I

.field public g:Lk03;

.field public h:I

.field public i:Z

.field public final j:Ljava/util/ArrayList;

.field public k:Z


# direct methods
.method public constructor <init>(Lk03;Ln4;ZLt91;Lb03;Lza3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ll62;->a:Ln4;

    .line 5
    .line 6
    iput-boolean p3, p0, Ll62;->b:Z

    .line 7
    .line 8
    iput-object p4, p0, Ll62;->c:Lt91;

    .line 9
    .line 10
    iput-object p5, p0, Ll62;->d:Lb03;

    .line 11
    .line 12
    iput-object p6, p0, Ll62;->e:Lza3;

    .line 13
    .line 14
    iput-object p1, p0, Ll62;->g:Lk03;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ll62;->j:Ljava/util/ArrayList;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Ll62;->k:Z

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Lrd0;)V
    .locals 1

    .line 1
    iget v0, p0, Ll62;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Ll62;->f:I

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Ll62;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ll62;->b()Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    invoke-virtual {p0}, Ll62;->b()Z

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public final b()Z
    .locals 3

    .line 1
    iget v0, p0, Ll62;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Ll62;->f:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ll62;->j:Ljava/util/ArrayList;

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
    iget-object v2, p0, Ll62;->a:Ln4;

    .line 23
    .line 24
    iget-object v2, v2, Ln4;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lu91;

    .line 27
    .line 28
    iget-object v2, v2, Lu91;->c:Lin0;

    .line 29
    .line 30
    invoke-interface {v2, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget p0, p0, Ll62;->f:I

    .line 37
    .line 38
    if-lez p0, :cond_1

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_1
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public final beginBatchEdit()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ll62;->f:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    add-int/2addr v0, v1

    .line 9
    iput v0, p0, Ll62;->f:I

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
    invoke-virtual {p0, v0}, Ll62;->sendKeyEvent(Landroid/view/KeyEvent;)Z

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
    invoke-virtual {p0, v0}, Ll62;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final clearMetaKeyStates(I)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    return p0
.end method

.method public final closeConnection()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll62;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Ll62;->f:I

    .line 8
    .line 9
    iput-boolean v0, p0, Ll62;->k:Z

    .line 10
    .line 11
    iget-object v1, p0, Ll62;->a:Ln4;

    .line 12
    .line 13
    iget-object v1, v1, Ln4;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lu91;

    .line 16
    .line 17
    iget-object v1, v1, Lu91;->j:Ljava/util/ArrayList;

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
    invoke-static {v3, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean p0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    return p0
.end method

.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    return p0
.end method

.method public final commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Ll62;->b:Z

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    return p1
.end method

.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lev;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, p1, p2}, Lev;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ll62;->a(Lrd0;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return v0
.end method

.method public final deleteSurroundingText(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lz60;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Lz60;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ll62;->a(Lrd0;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La70;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, La70;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ll62;->a(Lrd0;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method

.method public final endBatchEdit()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ll62;->b()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final finishComposingText()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lej0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ll62;->a(Lrd0;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method

.method public final getCursorCapsMode(I)I
    .locals 3

    .line 1
    iget-object p0, p0, Ll62;->g:Lk03;

    .line 2
    .line 3
    iget-object v0, p0, Lk03;->a:Lsd;

    .line 4
    .line 5
    iget-object v0, v0, Lsd;->i:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v1, p0, Lk03;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Lf13;->f(J)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0, p0, p1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
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
    iput-boolean v0, p0, Ll62;->i:Z

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
    iput v1, p0, Ll62;->h:I

    .line 17
    .line 18
    :cond_2
    iget-object p0, p0, Ll62;->g:Lk03;

    .line 19
    .line 20
    invoke-static {p0}, Lqp0;->j(Lk03;)Landroid/view/inputmethod/ExtractedText;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getSelectedText(I)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object p1, p0, Ll62;->g:Lk03;

    .line 2
    .line 3
    iget-wide v0, p1, Lk03;->b:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Lf13;->c(J)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object p0, p0, Ll62;->g:Lk03;

    .line 14
    .line 15
    invoke-static {p0}, Lt11;->A(Lk03;)Lsd;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, Lsd;->i:Ljava/lang/String;

    .line 20
    .line 21
    return-object p0
.end method

.method public final getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Ll62;->g:Lk03;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lt11;->B(Lk03;I)Lsd;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lsd;->i:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Ll62;->g:Lk03;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lt11;->C(Lk03;I)Lsd;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lsd;->i:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public final performContextMenuAction(I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

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
    invoke-virtual {p0, p1}, Ll62;->c(I)V

    .line 13
    .line 14
    .line 15
    return v0

    .line 16
    :pswitch_1
    const/16 p1, 0x116

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ll62;->c(I)V

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :pswitch_2
    const/16 p1, 0x115

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ll62;->c(I)V

    .line 25
    .line 26
    .line 27
    return v0

    .line 28
    :pswitch_3
    new-instance p1, Lmp2;

    .line 29
    .line 30
    iget-object v1, p0, Ll62;->g:Lk03;

    .line 31
    .line 32
    iget-object v1, v1, Lk03;->a:Lsd;

    .line 33
    .line 34
    iget-object v1, v1, Lsd;->i:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-direct {p1, v0, v1}, Lmp2;-><init>(II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ll62;->a(Lrd0;)V

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
    iget-boolean v0, p0, Ll62;->k:Z

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
    iget-object p0, p0, Ll62;->a:Ln4;

    .line 44
    .line 45
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lu91;

    .line 48
    .line 49
    iget-object p0, p0, Lu91;->d:Lin0;

    .line 50
    .line 51
    new-instance v1, Lwx0;

    .line 52
    .line 53
    invoke-direct {v1, p1}, Lwx0;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

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
    if-lt v3, v4, :cond_35

    .line 12
    .line 13
    new-instance v3, Lv;

    .line 14
    .line 15
    const/16 v4, 0x18

    .line 16
    .line 17
    invoke-direct {v3, v4, v0}, Lv;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    iget-object v5, v0, Ll62;->c:Lt91;

    .line 22
    .line 23
    const/4 v6, 0x3

    .line 24
    if-eqz v5, :cond_32

    .line 25
    .line 26
    iget-object v7, v5, Lt91;->j:Lsd;

    .line 27
    .line 28
    if-nez v7, :cond_0

    .line 29
    .line 30
    goto/16 :goto_19

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v5}, Lt91;->d()Lz03;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    if-eqz v8, :cond_1

    .line 37
    .line 38
    iget-object v8, v8, Lz03;->a:Ly03;

    .line 39
    .line 40
    iget-object v8, v8, Ly03;->a:Lx03;

    .line 41
    .line 42
    if-eqz v8, :cond_1

    .line 43
    .line 44
    iget-object v8, v8, Lx03;->a:Lsd;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v8, 0x0

    .line 48
    :goto_0
    invoke-virtual {v7, v8}, Lsd;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-nez v8, :cond_2

    .line 53
    .line 54
    goto/16 :goto_19

    .line 55
    .line 56
    :cond_2
    invoke-static/range {p1 .. p1}, Lmp0;->r(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const-wide v10, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    const/16 v8, 0x20

    .line 66
    .line 67
    const/4 v12, 0x1

    .line 68
    iget-object v13, v0, Ll62;->d:Lb03;

    .line 69
    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, Lmp0;->n(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lmp0;->i(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-static {v6}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v0}, Lmp0;->c(Landroid/view/inputmethod/SelectGesture;)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eq v7, v12, :cond_3

    .line 89
    .line 90
    move v7, v4

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move v7, v12

    .line 93
    :goto_1
    invoke-static {v5, v6, v7}, Lp40;->D(Lt91;Lo62;I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    invoke-static {v5, v6}, Lf13;->c(J)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_4

    .line 102
    .line 103
    invoke-static {v0}, Lmp0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    goto/16 :goto_19

    .line 112
    .line 113
    :cond_4
    new-instance v0, Lmp2;

    .line 114
    .line 115
    shr-long v7, v5, v8

    .line 116
    .line 117
    long-to-int v7, v7

    .line 118
    and-long/2addr v5, v10

    .line 119
    long-to-int v5, v5

    .line 120
    invoke-direct {v0, v7, v5}, Lmp2;-><init>(II)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v0}, Lv;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    if-eqz v13, :cond_5

    .line 127
    .line 128
    invoke-virtual {v13, v12}, Lb03;->h(Z)V

    .line 129
    .line 130
    .line 131
    :cond_5
    :goto_2
    move/from16 v16, v4

    .line 132
    .line 133
    move v6, v12

    .line 134
    goto/16 :goto_1a

    .line 135
    .line 136
    :cond_6
    invoke-static/range {p1 .. p1}, Lmp0;->D(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_a

    .line 141
    .line 142
    invoke-static/range {p1 .. p1}, Lzr0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, Lzr0;->c(Landroid/view/inputmethod/DeleteGesture;)I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eq v6, v12, :cond_7

    .line 151
    .line 152
    move v6, v4

    .line 153
    goto :goto_3

    .line 154
    :cond_7
    move v6, v12

    .line 155
    :goto_3
    invoke-static {v0}, Lzr0;->h(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static {v8}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-static {v5, v8, v6}, Lp40;->D(Lt91;Lo62;I)J

    .line 164
    .line 165
    .line 166
    move-result-wide v8

    .line 167
    invoke-static {v8, v9}, Lf13;->c(J)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_8

    .line 172
    .line 173
    invoke-static {v0}, Lmp0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    goto/16 :goto_19

    .line 182
    .line 183
    :cond_8
    if-ne v6, v12, :cond_9

    .line 184
    .line 185
    move v0, v12

    .line 186
    goto :goto_4

    .line 187
    :cond_9
    move v0, v4

    .line 188
    :goto_4
    invoke-static {v8, v9, v7, v0, v3}, Ltl;->Q(JLsd;ZLv;)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_a
    invoke-static/range {p1 .. p1}, Lzr0;->o(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    if-eqz v6, :cond_d

    .line 197
    .line 198
    invoke-static/range {p1 .. p1}, Lzr0;->l(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {v0}, Lzr0;->i(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-static {v6}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    invoke-static {v0}, Lzr0;->q(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-static {v7}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v0}, Lmp0;->d(Landroid/view/inputmethod/SelectRangeGesture;)I

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    if-eq v9, v12, :cond_b

    .line 223
    .line 224
    move v9, v4

    .line 225
    goto :goto_5

    .line 226
    :cond_b
    move v9, v12

    .line 227
    :goto_5
    invoke-static {v5, v6, v7, v9}, Lp40;->d(Lt91;Lo62;Lo62;I)J

    .line 228
    .line 229
    .line 230
    move-result-wide v5

    .line 231
    invoke-static {v5, v6}, Lf13;->c(J)Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-eqz v7, :cond_c

    .line 236
    .line 237
    invoke-static {v0}, Lmp0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    goto/16 :goto_19

    .line 246
    .line 247
    :cond_c
    new-instance v0, Lmp2;

    .line 248
    .line 249
    shr-long v7, v5, v8

    .line 250
    .line 251
    long-to-int v7, v7

    .line 252
    and-long/2addr v5, v10

    .line 253
    long-to-int v5, v5

    .line 254
    invoke-direct {v0, v7, v5}, Lmp2;-><init>(II)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v0}, Lv;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    if-eqz v13, :cond_5

    .line 261
    .line 262
    invoke-virtual {v13, v12}, Lb03;->h(Z)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_2

    .line 266
    .line 267
    :cond_d
    invoke-static/range {p1 .. p1}, Lzr0;->r(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_11

    .line 272
    .line 273
    invoke-static/range {p1 .. p1}, Lzr0;->k(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v0}, Lmp0;->t(Landroid/view/inputmethod/DeleteRangeGesture;)I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-eq v6, v12, :cond_e

    .line 282
    .line 283
    move v6, v4

    .line 284
    goto :goto_6

    .line 285
    :cond_e
    move v6, v12

    .line 286
    :goto_6
    invoke-static {v0}, Lmp0;->z(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-static {v8}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-static {v0}, Lmp0;->u(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    invoke-static {v9}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    invoke-static {v5, v8, v9, v6}, Lp40;->d(Lt91;Lo62;Lo62;I)J

    .line 303
    .line 304
    .line 305
    move-result-wide v8

    .line 306
    invoke-static {v8, v9}, Lf13;->c(J)Z

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eqz v5, :cond_f

    .line 311
    .line 312
    invoke-static {v0}, Lmp0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    goto/16 :goto_19

    .line 321
    .line 322
    :cond_f
    if-ne v6, v12, :cond_10

    .line 323
    .line 324
    move v0, v12

    .line 325
    goto :goto_7

    .line 326
    :cond_10
    move v0, v4

    .line 327
    :goto_7
    invoke-static {v8, v9, v7, v0, v3}, Ltl;->Q(JLsd;ZLv;)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :cond_11
    invoke-static/range {p1 .. p1}, Lmp0;->C(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    const/4 v10, 0x2

    .line 337
    iget-object v0, v0, Ll62;->e:Lza3;

    .line 338
    .line 339
    const/4 v11, -0x1

    .line 340
    if-eqz v6, :cond_1a

    .line 341
    .line 342
    invoke-static/range {p1 .. p1}, Lmp0;->l(Ljava/lang/Object;)Landroid/view/inputmethod/JoinOrSplitGesture;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    if-nez v0, :cond_12

    .line 347
    .line 348
    invoke-static {v6}, Lmp0;->v(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    goto/16 :goto_19

    .line 357
    .line 358
    :cond_12
    invoke-static {v6}, Lzr0;->f(Landroid/view/inputmethod/JoinOrSplitGesture;)Landroid/graphics/PointF;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    invoke-static {v9}, Lp40;->f(Landroid/graphics/PointF;)J

    .line 363
    .line 364
    .line 365
    move-result-wide v13

    .line 366
    invoke-static {v5, v13, v14, v0}, Lp40;->c(Lt91;JLza3;)I

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    if-eq v0, v11, :cond_19

    .line 371
    .line 372
    invoke-virtual {v5}, Lt91;->d()Lz03;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    if-eqz v5, :cond_13

    .line 377
    .line 378
    iget-object v5, v5, Lz03;->a:Ly03;

    .line 379
    .line 380
    invoke-static {v5, v0}, Lp40;->e(Ly03;I)Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-ne v5, v12, :cond_13

    .line 385
    .line 386
    goto :goto_b

    .line 387
    :cond_13
    move v5, v0

    .line 388
    :goto_8
    if-lez v5, :cond_15

    .line 389
    .line 390
    invoke-static {v7, v5}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 391
    .line 392
    .line 393
    move-result v6

    .line 394
    invoke-static {v6}, Lp40;->K(I)Z

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    if-nez v9, :cond_14

    .line 399
    .line 400
    goto :goto_9

    .line 401
    :cond_14
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 402
    .line 403
    .line 404
    move-result v6

    .line 405
    sub-int/2addr v5, v6

    .line 406
    goto :goto_8

    .line 407
    :cond_15
    :goto_9
    iget-object v6, v7, Lsd;->i:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 410
    .line 411
    .line 412
    move-result v6

    .line 413
    if-ge v0, v6, :cond_17

    .line 414
    .line 415
    invoke-static {v7, v0}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    invoke-static {v6}, Lp40;->K(I)Z

    .line 420
    .line 421
    .line 422
    move-result v9

    .line 423
    if-nez v9, :cond_16

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_16
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    add-int/2addr v0, v6

    .line 431
    goto :goto_9

    .line 432
    :cond_17
    :goto_a
    invoke-static {v5, v0}, Lfg1;->i(II)J

    .line 433
    .line 434
    .line 435
    move-result-wide v5

    .line 436
    invoke-static {v5, v6}, Lf13;->c(J)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-eqz v0, :cond_18

    .line 441
    .line 442
    shr-long/2addr v5, v8

    .line 443
    long-to-int v0, v5

    .line 444
    new-instance v5, Lmp2;

    .line 445
    .line 446
    invoke-direct {v5, v0, v0}, Lmp2;-><init>(II)V

    .line 447
    .line 448
    .line 449
    new-instance v0, Lev;

    .line 450
    .line 451
    const-string v6, " "

    .line 452
    .line 453
    invoke-direct {v0, v6, v12}, Lev;-><init>(Ljava/lang/String;I)V

    .line 454
    .line 455
    .line 456
    new-array v6, v10, [Lrd0;

    .line 457
    .line 458
    aput-object v5, v6, v4

    .line 459
    .line 460
    aput-object v0, v6, v12

    .line 461
    .line 462
    new-instance v0, Las0;

    .line 463
    .line 464
    invoke-direct {v0, v6}, Las0;-><init>([Lrd0;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v3, v0}, Lv;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    goto/16 :goto_2

    .line 471
    .line 472
    :cond_18
    invoke-static {v5, v6, v7, v4, v3}, Ltl;->Q(JLsd;ZLv;)V

    .line 473
    .line 474
    .line 475
    goto/16 :goto_2

    .line 476
    .line 477
    :cond_19
    :goto_b
    invoke-static {v6}, Lmp0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 482
    .line 483
    .line 484
    move-result v6

    .line 485
    goto/16 :goto_19

    .line 486
    .line 487
    :cond_1a
    invoke-static/range {p1 .. p1}, Lmp0;->x(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-eqz v6, :cond_1e

    .line 492
    .line 493
    invoke-static/range {p1 .. p1}, Lmp0;->k(Ljava/lang/Object;)Landroid/view/inputmethod/InsertGesture;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    if-nez v0, :cond_1b

    .line 498
    .line 499
    invoke-static {v6}, Lmp0;->v(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 504
    .line 505
    .line 506
    move-result v6

    .line 507
    goto/16 :goto_19

    .line 508
    .line 509
    :cond_1b
    invoke-static {v6}, Lmp0;->e(Landroid/view/inputmethod/InsertGesture;)Landroid/graphics/PointF;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    invoke-static {v7}, Lp40;->f(Landroid/graphics/PointF;)J

    .line 514
    .line 515
    .line 516
    move-result-wide v7

    .line 517
    invoke-static {v5, v7, v8, v0}, Lp40;->c(Lt91;JLza3;)I

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-eq v0, v11, :cond_1d

    .line 522
    .line 523
    invoke-virtual {v5}, Lt91;->d()Lz03;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    if-eqz v5, :cond_1c

    .line 528
    .line 529
    iget-object v5, v5, Lz03;->a:Ly03;

    .line 530
    .line 531
    invoke-static {v5, v0}, Lp40;->e(Ly03;I)Z

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    if-ne v5, v12, :cond_1c

    .line 536
    .line 537
    goto :goto_c

    .line 538
    :cond_1c
    invoke-static {v6}, Lmp0;->o(Landroid/view/inputmethod/InsertGesture;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    new-instance v6, Lmp2;

    .line 543
    .line 544
    invoke-direct {v6, v0, v0}, Lmp2;-><init>(II)V

    .line 545
    .line 546
    .line 547
    new-instance v0, Lev;

    .line 548
    .line 549
    invoke-direct {v0, v5, v12}, Lev;-><init>(Ljava/lang/String;I)V

    .line 550
    .line 551
    .line 552
    new-array v5, v10, [Lrd0;

    .line 553
    .line 554
    aput-object v6, v5, v4

    .line 555
    .line 556
    aput-object v0, v5, v12

    .line 557
    .line 558
    new-instance v0, Las0;

    .line 559
    .line 560
    invoke-direct {v0, v5}, Las0;-><init>([Lrd0;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v3, v0}, Lv;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    goto/16 :goto_2

    .line 567
    .line 568
    :cond_1d
    :goto_c
    invoke-static {v6}, Lmp0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 573
    .line 574
    .line 575
    move-result v6

    .line 576
    goto/16 :goto_19

    .line 577
    .line 578
    :cond_1e
    invoke-static/range {p1 .. p1}, Lmp0;->A(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v6

    .line 582
    if-eqz v6, :cond_31

    .line 583
    .line 584
    invoke-static/range {p1 .. p1}, Lmp0;->m(Ljava/lang/Object;)Landroid/view/inputmethod/RemoveSpaceGesture;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    invoke-virtual {v5}, Lt91;->d()Lz03;

    .line 589
    .line 590
    .line 591
    move-result-object v13

    .line 592
    if-eqz v13, :cond_1f

    .line 593
    .line 594
    iget-object v13, v13, Lz03;->a:Ly03;

    .line 595
    .line 596
    goto :goto_d

    .line 597
    :cond_1f
    const/4 v13, 0x0

    .line 598
    :goto_d
    invoke-static {v6}, Lmp0;->f(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    .line 599
    .line 600
    .line 601
    move-result-object v14

    .line 602
    invoke-static {v14}, Lp40;->f(Landroid/graphics/PointF;)J

    .line 603
    .line 604
    .line 605
    move-result-wide v14

    .line 606
    invoke-static {v6}, Lzr0;->g(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    .line 607
    .line 608
    .line 609
    move-result-object v16

    .line 610
    move/from16 v17, v8

    .line 611
    .line 612
    invoke-static/range {v16 .. v16}, Lp40;->f(Landroid/graphics/PointF;)J

    .line 613
    .line 614
    .line 615
    move-result-wide v8

    .line 616
    invoke-virtual {v5}, Lt91;->c()Lc61;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    if-eqz v13, :cond_24

    .line 621
    .line 622
    iget-object v13, v13, Ly03;->b:Llj1;

    .line 623
    .line 624
    if-nez v5, :cond_20

    .line 625
    .line 626
    goto :goto_f

    .line 627
    :cond_20
    invoke-interface {v5, v14, v15}, Lc61;->s(J)J

    .line 628
    .line 629
    .line 630
    move-result-wide v14

    .line 631
    invoke-interface {v5, v8, v9}, Lc61;->s(J)J

    .line 632
    .line 633
    .line 634
    move-result-wide v8

    .line 635
    invoke-static {v13, v14, v15, v0}, Lp40;->B(Llj1;JLza3;)I

    .line 636
    .line 637
    .line 638
    move-result v5

    .line 639
    invoke-static {v13, v8, v9, v0}, Lp40;->B(Llj1;JLza3;)I

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-ne v5, v11, :cond_21

    .line 644
    .line 645
    if-ne v0, v11, :cond_23

    .line 646
    .line 647
    sget-wide v8, Lf13;->b:J

    .line 648
    .line 649
    goto :goto_10

    .line 650
    :cond_21
    if-ne v0, v11, :cond_22

    .line 651
    .line 652
    goto :goto_e

    .line 653
    :cond_22
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 654
    .line 655
    .line 656
    move-result v5

    .line 657
    :goto_e
    move v0, v5

    .line 658
    :cond_23
    invoke-virtual {v13, v0}, Llj1;->f(I)F

    .line 659
    .line 660
    .line 661
    move-result v5

    .line 662
    invoke-virtual {v13, v0}, Llj1;->b(I)F

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    add-float/2addr v0, v5

    .line 667
    const/high16 v5, 0x40000000    # 2.0f

    .line 668
    .line 669
    div-float/2addr v0, v5

    .line 670
    new-instance v5, Lo62;

    .line 671
    .line 672
    shr-long v14, v14, v17

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
    shr-long v8, v8, v17

    .line 680
    .line 681
    long-to-int v8, v8

    .line 682
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 683
    .line 684
    .line 685
    move-result v9

    .line 686
    invoke-static {v15, v9}, Ljava/lang/Math;->min(FF)F

    .line 687
    .line 688
    .line 689
    move-result v9

    .line 690
    const p0, 0x3dcccccd    # 0.1f

    .line 691
    .line 692
    .line 693
    sub-float v15, v0, p0

    .line 694
    .line 695
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 696
    .line 697
    .line 698
    move-result v14

    .line 699
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 700
    .line 701
    .line 702
    move-result v8

    .line 703
    invoke-static {v14, v8}, Ljava/lang/Math;->max(FF)F

    .line 704
    .line 705
    .line 706
    move-result v8

    .line 707
    add-float v0, v0, p0

    .line 708
    .line 709
    invoke-direct {v5, v9, v15, v8, v0}, Lo62;-><init>(FFFF)V

    .line 710
    .line 711
    .line 712
    sget-object v0, Lgd3;->M:Lum2;

    .line 713
    .line 714
    invoke-virtual {v13, v5, v4, v0}, Llj1;->h(Lo62;ILum2;)J

    .line 715
    .line 716
    .line 717
    move-result-wide v8

    .line 718
    goto :goto_10

    .line 719
    :cond_24
    :goto_f
    sget-wide v8, Lf13;->b:J

    .line 720
    .line 721
    :goto_10
    invoke-static {v8, v9}, Lf13;->c(J)Z

    .line 722
    .line 723
    .line 724
    move-result v0

    .line 725
    if-eqz v0, :cond_25

    .line 726
    .line 727
    invoke-static {v6}, Lmp0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 732
    .line 733
    .line 734
    move-result v6

    .line 735
    goto/16 :goto_19

    .line 736
    .line 737
    :cond_25
    invoke-static {v8, v9}, Lf13;->f(J)I

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    invoke-static {v8, v9}, Lf13;->e(J)I

    .line 742
    .line 743
    .line 744
    move-result v5

    .line 745
    invoke-virtual {v7, v0, v5}, Lsd;->a(II)Lsd;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    iget-object v0, v0, Lsd;->i:Ljava/lang/String;

    .line 750
    .line 751
    const-string v5, "\\s+"

    .line 752
    .line 753
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v5, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 764
    .line 765
    .line 766
    move-result-object v5

    .line 767
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v5, v4}, Ljava/util/regex/Matcher;->find(I)Z

    .line 771
    .line 772
    .line 773
    move-result v7

    .line 774
    if-nez v7, :cond_26

    .line 775
    .line 776
    const/4 v7, 0x0

    .line 777
    goto :goto_11

    .line 778
    :cond_26
    new-instance v7, Lkj1;

    .line 779
    .line 780
    invoke-direct {v7, v5, v0}, Lkj1;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 781
    .line 782
    .line 783
    :goto_11
    if-nez v7, :cond_27

    .line 784
    .line 785
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    move/from16 v16, v4

    .line 790
    .line 791
    move v4, v11

    .line 792
    move v5, v4

    .line 793
    move v15, v5

    .line 794
    goto/16 :goto_17

    .line 795
    .line 796
    :cond_27
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 797
    .line 798
    .line 799
    move-result v5

    .line 800
    new-instance v13, Ljava/lang/StringBuilder;

    .line 801
    .line 802
    invoke-direct {v13, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 803
    .line 804
    .line 805
    move v14, v4

    .line 806
    move/from16 v16, v14

    .line 807
    .line 808
    move v15, v11

    .line 809
    :goto_12
    invoke-virtual {v7}, Lkj1;->z()Lc11;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    iget v4, v4, La11;->h:I

    .line 814
    .line 815
    invoke-virtual {v13, v0, v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    if-ne v15, v11, :cond_28

    .line 819
    .line 820
    invoke-virtual {v7}, Lkj1;->z()Lc11;

    .line 821
    .line 822
    .line 823
    move-result-object v4

    .line 824
    iget v15, v4, La11;->h:I

    .line 825
    .line 826
    :cond_28
    invoke-virtual {v7}, Lkj1;->z()Lc11;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    iget v4, v4, La11;->i:I

    .line 831
    .line 832
    add-int/2addr v4, v12

    .line 833
    const-string v14, ""

    .line 834
    .line 835
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v7}, Lkj1;->z()Lc11;

    .line 839
    .line 840
    .line 841
    move-result-object v14

    .line 842
    iget v14, v14, La11;->i:I

    .line 843
    .line 844
    add-int/2addr v14, v12

    .line 845
    iget-object v10, v7, Lkj1;->j:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v10, Ljava/lang/CharSequence;

    .line 848
    .line 849
    iget-object v7, v7, Lkj1;->i:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v7, Ljava/util/regex/Matcher;

    .line 852
    .line 853
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->end()I

    .line 854
    .line 855
    .line 856
    move-result v18

    .line 857
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->end()I

    .line 858
    .line 859
    .line 860
    move-result v12

    .line 861
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->start()I

    .line 862
    .line 863
    .line 864
    move-result v11

    .line 865
    if-ne v12, v11, :cond_29

    .line 866
    .line 867
    const/4 v11, 0x1

    .line 868
    goto :goto_13

    .line 869
    :cond_29
    move/from16 v11, v16

    .line 870
    .line 871
    :goto_13
    add-int v11, v18, v11

    .line 872
    .line 873
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 874
    .line 875
    .line 876
    move-result v12

    .line 877
    if-gt v11, v12, :cond_2b

    .line 878
    .line 879
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->pattern()Ljava/util/regex/Pattern;

    .line 880
    .line 881
    .line 882
    move-result-object v7

    .line 883
    invoke-virtual {v7, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 884
    .line 885
    .line 886
    move-result-object v7

    .line 887
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v7, v11}, Ljava/util/regex/Matcher;->find(I)Z

    .line 891
    .line 892
    .line 893
    move-result v11

    .line 894
    if-nez v11, :cond_2a

    .line 895
    .line 896
    const/4 v11, 0x0

    .line 897
    goto :goto_14

    .line 898
    :cond_2a
    new-instance v11, Lkj1;

    .line 899
    .line 900
    invoke-direct {v11, v7, v10}, Lkj1;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 901
    .line 902
    .line 903
    :goto_14
    move-object v7, v11

    .line 904
    goto :goto_15

    .line 905
    :cond_2b
    const/4 v7, 0x0

    .line 906
    :goto_15
    if-ge v14, v5, :cond_2d

    .line 907
    .line 908
    if-nez v7, :cond_2c

    .line 909
    .line 910
    goto :goto_16

    .line 911
    :cond_2c
    const/4 v10, 0x2

    .line 912
    const/4 v11, -0x1

    .line 913
    const/4 v12, 0x1

    .line 914
    goto :goto_12

    .line 915
    :cond_2d
    :goto_16
    if-ge v14, v5, :cond_2e

    .line 916
    .line 917
    invoke-virtual {v13, v0, v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    :cond_2e
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    const/4 v5, -0x1

    .line 925
    :goto_17
    if-eq v15, v5, :cond_30

    .line 926
    .line 927
    if-ne v4, v5, :cond_2f

    .line 928
    .line 929
    goto :goto_18

    .line 930
    :cond_2f
    shr-long v5, v8, v17

    .line 931
    .line 932
    long-to-int v5, v5

    .line 933
    add-int v6, v5, v15

    .line 934
    .line 935
    add-int/2addr v5, v4

    .line 936
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 937
    .line 938
    .line 939
    move-result v7

    .line 940
    invoke-static {v8, v9}, Lf13;->d(J)I

    .line 941
    .line 942
    .line 943
    move-result v8

    .line 944
    sub-int/2addr v8, v4

    .line 945
    sub-int/2addr v7, v8

    .line 946
    invoke-virtual {v0, v15, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    new-instance v4, Lmp2;

    .line 951
    .line 952
    invoke-direct {v4, v6, v5}, Lmp2;-><init>(II)V

    .line 953
    .line 954
    .line 955
    new-instance v5, Lev;

    .line 956
    .line 957
    const/4 v6, 0x1

    .line 958
    invoke-direct {v5, v0, v6}, Lev;-><init>(Ljava/lang/String;I)V

    .line 959
    .line 960
    .line 961
    const/4 v0, 0x2

    .line 962
    new-array v0, v0, [Lrd0;

    .line 963
    .line 964
    aput-object v4, v0, v16

    .line 965
    .line 966
    aput-object v5, v0, v6

    .line 967
    .line 968
    new-instance v4, Las0;

    .line 969
    .line 970
    invoke-direct {v4, v0}, Las0;-><init>([Lrd0;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v3, v4}, Lv;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    goto :goto_1a

    .line 977
    :cond_30
    :goto_18
    invoke-static {v6}, Lmp0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    invoke-static {v0, v3}, Ltl;->x(Landroid/view/inputmethod/HandwritingGesture;Lv;)I

    .line 982
    .line 983
    .line 984
    move-result v6

    .line 985
    goto :goto_1a

    .line 986
    :cond_31
    move/from16 v16, v4

    .line 987
    .line 988
    move v0, v10

    .line 989
    move v6, v0

    .line 990
    goto :goto_1a

    .line 991
    :cond_32
    :goto_19
    move/from16 v16, v4

    .line 992
    .line 993
    :goto_1a
    if-nez v2, :cond_33

    .line 994
    .line 995
    goto :goto_1b

    .line 996
    :cond_33
    if-eqz v1, :cond_34

    .line 997
    .line 998
    new-instance v0, Lpe;

    .line 999
    .line 1000
    move/from16 v3, v16

    .line 1001
    .line 1002
    invoke-direct {v0, v6, v3, v2}, Lpe;-><init>(IILjava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1006
    .line 1007
    .line 1008
    return-void

    .line 1009
    :cond_34
    invoke-interface {v2, v6}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 1010
    .line 1011
    .line 1012
    :cond_35
    :goto_1b
    return-void
.end method

.method public final performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    :cond_0
    return p0
.end method

.method public final previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 7

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
    iget-object v0, p0, Ll62;->c:Lt91;

    .line 9
    .line 10
    if-eqz v0, :cond_14

    .line 11
    .line 12
    iget-object v1, v0, Lt91;->j:Lsd;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, Lt91;->d()Lz03;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iget-object v3, v3, Lz03;->a:Ly03;

    .line 25
    .line 26
    iget-object v3, v3, Ly03;->a:Lx03;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    iget-object v3, v3, Lx03;->a:Lsd;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x0

    .line 34
    :goto_0
    invoke-virtual {v1, v3}, Lsd;->equals(Ljava/lang/Object;)Z

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
    invoke-static {p1}, Lmp0;->r(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v3, 0x1

    .line 47
    sget-object v4, Ltr0;->h:Ltr0;

    .line 48
    .line 49
    iget-object p0, p0, Ll62;->d:Lb03;

    .line 50
    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-static {p1}, Lmp0;->n(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p0, :cond_12

    .line 58
    .line 59
    invoke-static {p1}, Lmp0;->i(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {p1}, Lmp0;->c(Landroid/view/inputmethod/SelectGesture;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eq p1, v3, :cond_3

    .line 72
    .line 73
    move p1, v2

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move p1, v3

    .line 76
    :goto_1
    invoke-static {v0, v1, p1}, Lp40;->D(Lt91;Lo62;I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1, v0, v1}, Lt91;->f(J)V

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    sget-wide v5, Lf13;->b:J

    .line 92
    .line 93
    invoke-virtual {p1, v5, v6}, Lt91;->e(J)V

    .line 94
    .line 95
    .line 96
    :cond_5
    invoke-static {v0, v1}, Lf13;->c(J)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_12

    .line 101
    .line 102
    invoke-virtual {p0, v2}, Lb03;->t(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v4}, Lb03;->q(Ltr0;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :cond_6
    invoke-static {p1}, Lmp0;->D(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_a

    .line 115
    .line 116
    invoke-static {p1}, Lzr0;->j(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p0, :cond_12

    .line 121
    .line 122
    invoke-static {p1}, Lmp0;->g(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v1}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {p1}, Lmp0;->a(Landroid/view/inputmethod/DeleteGesture;)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eq p1, v3, :cond_7

    .line 135
    .line 136
    move p1, v2

    .line 137
    goto :goto_2

    .line 138
    :cond_7
    move p1, v3

    .line 139
    :goto_2
    invoke-static {v0, v1, p1}, Lp40;->D(Lt91;Lo62;I)J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 144
    .line 145
    if-eqz p1, :cond_8

    .line 146
    .line 147
    invoke-virtual {p1, v0, v1}, Lt91;->e(J)V

    .line 148
    .line 149
    .line 150
    :cond_8
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 151
    .line 152
    if-eqz p1, :cond_9

    .line 153
    .line 154
    sget-wide v5, Lf13;->b:J

    .line 155
    .line 156
    invoke-virtual {p1, v5, v6}, Lt91;->f(J)V

    .line 157
    .line 158
    .line 159
    :cond_9
    invoke-static {v0, v1}, Lf13;->c(J)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_12

    .line 164
    .line 165
    invoke-virtual {p0, v2}, Lb03;->t(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v4}, Lb03;->q(Ltr0;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :cond_a
    invoke-static {p1}, Lzr0;->o(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_e

    .line 178
    .line 179
    invoke-static {p1}, Lzr0;->l(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-eqz p0, :cond_12

    .line 184
    .line 185
    invoke-static {p1}, Lzr0;->i(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {p1}, Lzr0;->q(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-static {v5}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-static {p1}, Lmp0;->d(Landroid/view/inputmethod/SelectRangeGesture;)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eq p1, v3, :cond_b

    .line 206
    .line 207
    move p1, v2

    .line 208
    goto :goto_3

    .line 209
    :cond_b
    move p1, v3

    .line 210
    :goto_3
    invoke-static {v0, v1, v5, p1}, Lp40;->d(Lt91;Lo62;Lo62;I)J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 215
    .line 216
    if-eqz p1, :cond_c

    .line 217
    .line 218
    invoke-virtual {p1, v0, v1}, Lt91;->f(J)V

    .line 219
    .line 220
    .line 221
    :cond_c
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 222
    .line 223
    if-eqz p1, :cond_d

    .line 224
    .line 225
    sget-wide v5, Lf13;->b:J

    .line 226
    .line 227
    invoke-virtual {p1, v5, v6}, Lt91;->e(J)V

    .line 228
    .line 229
    .line 230
    :cond_d
    invoke-static {v0, v1}, Lf13;->c(J)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-nez p1, :cond_12

    .line 235
    .line 236
    invoke-virtual {p0, v2}, Lb03;->t(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, v4}, Lb03;->q(Ltr0;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_e
    invoke-static {p1}, Lzr0;->r(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_14

    .line 248
    .line 249
    invoke-static {p1}, Lzr0;->k(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    if-eqz p0, :cond_12

    .line 254
    .line 255
    invoke-static {p1}, Lmp0;->h(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {v1}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {p1}, Lmp0;->u(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-static {v5}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-static {p1}, Lmp0;->b(Landroid/view/inputmethod/DeleteRangeGesture;)I

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-eq p1, v3, :cond_f

    .line 276
    .line 277
    move p1, v2

    .line 278
    goto :goto_4

    .line 279
    :cond_f
    move p1, v3

    .line 280
    :goto_4
    invoke-static {v0, v1, v5, p1}, Lp40;->d(Lt91;Lo62;Lo62;I)J

    .line 281
    .line 282
    .line 283
    move-result-wide v0

    .line 284
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 285
    .line 286
    if-eqz p1, :cond_10

    .line 287
    .line 288
    invoke-virtual {p1, v0, v1}, Lt91;->e(J)V

    .line 289
    .line 290
    .line 291
    :cond_10
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 292
    .line 293
    if-eqz p1, :cond_11

    .line 294
    .line 295
    sget-wide v5, Lf13;->b:J

    .line 296
    .line 297
    invoke-virtual {p1, v5, v6}, Lt91;->f(J)V

    .line 298
    .line 299
    .line 300
    :cond_11
    invoke-static {v0, v1}, Lf13;->c(J)Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-nez p1, :cond_12

    .line 305
    .line 306
    invoke-virtual {p0, v2}, Lb03;->t(Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0, v4}, Lb03;->q(Ltr0;)V

    .line 310
    .line 311
    .line 312
    :cond_12
    :goto_5
    if-eqz p2, :cond_13

    .line 313
    .line 314
    new-instance p1, Ldx;

    .line 315
    .line 316
    invoke-direct {p1, v3, p0}, Ldx;-><init>(ILjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 320
    .line 321
    .line 322
    :cond_13
    return v3

    .line 323
    :cond_14
    :goto_6
    return v2
.end method

.method public final reportFullscreenMode(Z)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final requestCursorUpdates(I)Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

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
    iget-object p0, p0, Ll62;->a:Ln4;

    .line 82
    .line 83
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Lu91;

    .line 86
    .line 87
    iget-object p0, p0, Lu91;->m:Ln91;

    .line 88
    .line 89
    iget-object v4, p0, Ln91;->c:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v4

    .line 92
    :try_start_0
    iput-boolean v5, p0, Ln91;->f:Z

    .line 93
    .line 94
    iput-boolean v6, p0, Ln91;->g:Z

    .line 95
    .line 96
    iput-boolean v1, p0, Ln91;->h:Z

    .line 97
    .line 98
    iput-boolean p1, p0, Ln91;->i:Z

    .line 99
    .line 100
    if-eqz v0, :cond_9

    .line 101
    .line 102
    iput-boolean v2, p0, Ln91;->e:Z

    .line 103
    .line 104
    iget-object p1, p0, Ln91;->j:Lk03;

    .line 105
    .line 106
    if-eqz p1, :cond_9

    .line 107
    .line 108
    invoke-virtual {p0}, Ln91;->a()V

    .line 109
    .line 110
    .line 111
    goto :goto_8

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_9

    .line 114
    :cond_9
    :goto_8
    iput-boolean v3, p0, Ln91;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    monitor-exit v4

    .line 117
    return v2

    .line 118
    :goto_9
    monitor-exit v4

    .line 119
    throw p0

    .line 120
    :cond_a
    return v0
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ll62;->a:Ln4;

    .line 6
    .line 7
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lu91;

    .line 10
    .line 11
    iget-object p0, p0, Lu91;->k:Lj71;

    .line 12
    .line 13
    invoke-interface {p0}, Lj71;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/view/inputmethod/BaseInputConnection;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    return v0
.end method

.method public final setComposingRegion(II)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lkp2;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lkp2;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ll62;->a(Lrd0;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return v0
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Llp2;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, p1, p2}, Llp2;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ll62;->a(Lrd0;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return v0
.end method

.method public final setSelection(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll62;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lmp2;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Lmp2;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ll62;->a(Lrd0;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method
