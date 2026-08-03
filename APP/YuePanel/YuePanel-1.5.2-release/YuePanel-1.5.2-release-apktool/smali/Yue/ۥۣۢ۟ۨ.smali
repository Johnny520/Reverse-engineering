.class public final LYue/ۥۣۢ۟ۨ;
.super Landroid/text/SpannableStringBuilder;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢ۟ۨ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/Class;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/util/List;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06e3\u06e8$\u06e5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    .line 3
    const-string v0, "watcherClass cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iput-object p1, p0, LYue/ۥۣۢ۟ۨ;->ۥۣ۟۟۠:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/CharSequence;)V
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/CharSequence;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 6
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    .line 7
    const-string p2, "watcherClass cannot be null"

    invoke-static {p1, p2}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iput-object p1, p0, LYue/ۥۣۢ۟ۨ;->ۥۣ۟۟۠:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/CharSequence;II)V
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/CharSequence;",
            "II)V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p2, p3, p4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;II)V

    .line 10
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    .line 11
    const-string p2, "watcherClass cannot be null"

    invoke-static {p1, p2}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iput-object p1, p0, LYue/ۥۣۢ۟ۨ;->ۥۣ۟۟۠:Ljava/lang/Class;

    return-void
.end method

.method public static ۥ۟۟(Ljava/lang/Class;Ljava/lang/CharSequence;)LYue/ۥۣۢ۟ۨ;
    .locals 1
    .param p0    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/CharSequence;",
            ")",
            "LYue/\u06e5\u06e2\u06df\u06e3\u06e8;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۢ۟ۨ;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۢ۟ۨ;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic append(C)Landroid/text/Editable;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 3
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣۢ۟ۨ;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public append(C)Landroid/text/SpannableStringBuilder;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 8
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 7
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 9
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;Ljava/lang/Object;I)Landroid/text/SpannableStringBuilder;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 10
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;Ljava/lang/Object;I)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣۢ۟ۨ;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic delete(II)Landroid/text/Editable;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢ۟ۨ;->delete(II)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public delete(II)Landroid/text/SpannableStringBuilder;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public getSpanEnd(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۣۢ۟ۨ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public getSpanFlags(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۣۢ۟ۨ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->getSpanFlags(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public getSpanStart(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۣۢ۟ۨ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public getSpans(IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 1
    .param p3    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(II",
            "Ljava/lang/Class<",
            "TT;>;)[TT;"
        }
    .end annotation

    invoke-virtual {p0, p3}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟ۡ(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-class v0, LYue/ۥۣۢ۟ۨ$ۥ;

    invoke-super {p0, p1, p2, v0}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LYue/ۥۣۢ۟ۨ$ۥ;

    array-length p2, p1

    invoke-static {p3, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    :goto_0
    array-length v0, p1

    if-ge p3, v0, :cond_0

    aget-object v0, p1, p3

    iget-object v0, v0, LYue/ۥۣۢ۟ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    aput-object v0, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-object p2

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic insert(ILjava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢ۟ۨ;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic insert(ILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, LYue/ۥۣۢ۟ۨ;->insert(ILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 3
    invoke-super {p0, p1, p2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public insert(ILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public nextSpanTransition(IILjava/lang/Class;)I
    .locals 1
    .param p3    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    if-eqz p3, :cond_0

    invoke-virtual {p0, p3}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟ۡ(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-class p3, LYue/ۥۣۢ۟ۨ$ۥ;

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->nextSpanTransition(IILjava/lang/Class;)I

    move-result p1

    return p1
.end method

.method public removeSpan(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۣۢ۟ۨ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    if-eqz v0, :cond_2

    iget-object p1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public bridge synthetic replace(IILjava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣۢ۟ۨ;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 2
    invoke-virtual/range {p0 .. p5}, LYue/ۥۣۢ۟ۨ;->replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 3
    invoke-virtual {p0}, LYue/ۥۣۢ۟ۨ;->ۥ۟()V

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 5
    invoke-virtual {p0}, LYue/ۥۣۢ۟ۨ;->ۥۣ۟۟۟()V

    return-object p0
.end method

.method public replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 6
    invoke-virtual {p0}, LYue/ۥۣۢ۟ۨ;->ۥ۟()V

    .line 7
    invoke-super/range {p0 .. p5}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    .line 8
    invoke-virtual {p0}, LYue/ۥۣۢ۟ۨ;->ۥۣ۟۟۟()V

    return-object p0
.end method

.method public setSpan(Ljava/lang/Object;III)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۣۢ۟ۨ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥۣۢ۟ۨ$ۥ;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p1, v0

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public subSequence(II)Ljava/lang/CharSequence;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۢ۟ۨ;

    iget-object v1, p0, LYue/ۥۣۢ۟ۨ;->ۥۣ۟۟۠:Ljava/lang/Class;

    invoke-direct {v0, v1, p0, p1, p2}, LYue/ۥۣۢ۟ۨ;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;II)V

    return-object v0
.end method

.method public ۥ()V
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣۢ۟ۨ;->ۥ۟()V

    return-void
.end method

.method public final ۥ۟()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣۢ۟ۨ$ۥ;

    invoke-virtual {v1}, LYue/ۥۣۢ۟ۨ$ۥ;->ۥ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟()V
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣۢ۟ۨ;->ۥۣ۟۟۟()V

    invoke-virtual {p0}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟۟()V

    return-void
.end method

.method public final ۥ۟۟۟۟()V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣۢ۟ۨ$ۥ;

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v2, p0, v0, v3, v4}, LYue/ۥۣۢ۟ۨ$ۥ;->onTextChanged(Ljava/lang/CharSequence;III)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۣۢ۟ۨ$ۥ;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣۢ۟ۨ$ۥ;

    iget-object v2, v1, LYue/ۥۣۢ۟ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟۟۟ۡ(Ljava/lang/Class;)Z
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥۣ۟۟۠:Ljava/lang/Class;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟۟۟ۢ(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۟ۡ(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥۣ۟۟۟()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣۢ۟ۨ$ۥ;

    invoke-virtual {v1}, LYue/ۥۣۢ۟ۨ$ۥ;->ۥ۟۟()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
