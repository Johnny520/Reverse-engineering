.class public abstract Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:Z

.field public ۥ۟۟۟۟:[I
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟۠:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/emoji2/text/\u06e5\u06df\u06df$\u06e5\u06df\u06df\u06df\u06e1;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۡ:Z

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:I

.field public ۥ۟۟۟ۤ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;)V
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0xff0100

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۢ:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥۣ۟۟۟:I

    new-instance v0, Landroidx/emoji2/text/ۥ۟;

    invoke-direct {v0}, Landroidx/emoji2/text/ۥ۟;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۤ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;

    const-string v0, "metadataLoader cannot be null."

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;

    return-void
.end method


# virtual methods
.method public final ۥ()Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;

    return-object v0
.end method

.method public ۥ۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-string v0, "initCallback cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۡۨۦ;

    invoke-direct {v0}, LYue/ۥ۟ۡۨۦ;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/Set;

    :cond_0
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ۥ۟۟(I)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۢ:I

    return-object p0
.end method

.method public ۥ۟۟۟(Z)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۡ:Z

    return-object p0
.end method

.method public ۥ۟۟۟۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-string v0, "GlyphChecker cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۤ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;

    return-object p0
.end method

.method public ۥ۟۟۟۠(I)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥۣ۟۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(Z)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟:Z

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 0
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;

    return-object p0
.end method

.method public ۥۣ۟۟۟(Z)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۤ(ZLjava/util/List;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ(ZLjava/util/List;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 3
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/emoji2/text/\u06e5\u06df\u06df$\u06e5\u06df\u06df\u06df;"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟:Z

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۟:[I

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۟:[I

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v1, p2

    move p2, v2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۟:[I

    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۟:[I

    :goto_1
    return-object p0
.end method

.method public ۥ۟۟۟ۥ(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-string v0, "initCallback cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/Set;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method
