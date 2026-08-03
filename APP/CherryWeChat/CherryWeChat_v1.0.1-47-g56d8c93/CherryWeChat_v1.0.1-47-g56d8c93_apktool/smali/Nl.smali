.class public final LNl;
.super LFb;
.source ""


# instance fields
.field public d:I

.field public final synthetic e:Lkotlin/jvm/functions/Function2;

.field public final synthetic f:LEb;


# direct methods
.method public constructor <init>(LEb;Lac;Lkotlin/jvm/functions/Function2;LEb;)V
    .locals 0

    iput-object p3, p0, LNl;->e:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, LNl;->f:LEb;

    invoke-direct {p0, p1, p2}, LFb;-><init>(LEb;Lac;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, LNl;->d:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iput v1, p0, LNl;->d:I

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, LNl;->d:I

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LNl;->e:Lkotlin/jvm/functions/Function2;

    invoke-static {v1, p1}, LTB;->c(ILjava/lang/Object;)V

    iget-object v0, p0, LNl;->f:LEb;

    invoke-interface {p1, v0, p0}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
