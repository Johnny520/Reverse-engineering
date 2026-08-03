.class public LYue/ۥۣۢ۠۠$ۥ۟۟;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢ۠۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e0\u06e1\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:I


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡ۠ۤ;)V
    .locals 2

    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ:Ljava/util/ArrayList;

    const/4 v1, 0x2

    iput v1, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ۟:I

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ۟:I

    invoke-virtual {p1}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ۟:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ:Ljava/util/ArrayList;

    const-string v1, " > "

    invoke-static {v0, v1}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۥ(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 4

    const/4 v0, 0x0

    if-ne p2, p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_3

    if-nez p2, :cond_1

    return v0

    :cond_1
    iget-object v3, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۡ۠ۤ;

    invoke-virtual {v3, p1, p2}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z

    move-result v3

    if-nez v3, :cond_2

    return v0

    :cond_2
    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤۤ()LYue/ۥ۠۠ۥۥ;

    move-result-object p2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    return v2
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۡ۠ۤ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ۟:I

    invoke-virtual {p1}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, LYue/ۥۣۢ۠۠$ۥ۟۟;->ۥ۟:I

    return-void
.end method
