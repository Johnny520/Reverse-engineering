.class public abstract Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06df\u06e6"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;,
        Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟;,
        Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟;,
        Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:I = 0x2

.field public static final ۥ۟۟۟ۢ:I = 0x8

.field public static final ۥۣ۟۟۟:I = 0x4

.field public static final ۥ۟۟۟ۤ:I = 0x800

.field public static final ۥ۟۟۟ۥ:I = 0x1000


# instance fields
.field public ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟;

.field public ۥ۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e6$\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟:J

.field public ۥ۟۟۟:J

.field public ۥ۟۟۟۟:J

.field public ۥ۟۟۟۠:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟:Ljava/util/ArrayList;

    const-wide/16 v0, 0x78

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟:J

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟:J

    const-wide/16 v0, 0xfa

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:J

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟۠:J

    return-void
.end method

.method public static ۥ۟۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)I
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->mFlags:I

    and-int/lit8 v1, v0, 0xe

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->isInvalid()Z

    move-result v2

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    return v3

    :cond_0
    and-int/2addr v0, v3

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->getOldPosition()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->getAdapterPosition()I

    move-result p0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    if-eq p0, v2, :cond_1

    if-eq v0, p0, :cond_1

    or-int/lit16 v1, v1, 0x800

    :cond_1
    return v1
.end method


# virtual methods
.method public abstract ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)Z
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)Z
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)Z
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)Z
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public ۥ۟۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Ljava/util/List;)Z
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06e1\u06e4;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥۣ۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    :cond_0
    return-void
.end method

.method public final ۥۣ۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public final ۥ۟۟۟ۤ()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟;

    invoke-interface {v2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟;->ۥ()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public abstract ۥ۟۟۟ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟ۦ()V
.end method

.method public ۥ۟۟۟ۧ()J
    .locals 2

    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟:J

    return-wide v0
.end method

.method public ۥ۟۟۟ۨ()J
    .locals 2

    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟۠:J

    return-wide v0
.end method

.method public ۥ۟۟۠()J
    .locals 2

    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:J

    return-wide v0
.end method

.method public ۥ۟۟۠۟()J
    .locals 2

    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟:J

    return-wide v0
.end method

.method public abstract ۥ۟۟۠۠()Z
.end method

.method public final ۥ۟۟۠ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟;)Z
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۠۠()Z

    move-result v0

    if-eqz p1, :cond_1

    if-nez v0, :cond_0

    invoke-interface {p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟;->ۥ()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return v0
.end method

.method public ۥ۟۟۠ۢ()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;-><init>()V

    return-object v0
.end method

.method public ۥۣ۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public ۥ۟۟۠ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۠ۢ()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;ILjava/util/List;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06e1\u06e1;",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06e1\u06e4;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e6$\u06e5\u06df\u06df\u06df;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۠ۢ()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۥ۟۟۠ۧ()V
.end method

.method public ۥ۟۟۠ۨ(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟:J

    return-void
.end method

.method public ۥ۟۟ۡ(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟۠:J

    return-void
.end method

.method public ۥ۟۟ۡ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟;

    return-void
.end method

.method public ۥ۟۟ۡ۠(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:J

    return-void
.end method

.method public ۥ۟۟ۡۡ(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟:J

    return-void
.end method
