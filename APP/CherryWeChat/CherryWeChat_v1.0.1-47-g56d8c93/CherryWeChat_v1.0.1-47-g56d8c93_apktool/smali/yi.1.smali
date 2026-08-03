.class public final Lyi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lxi;


# instance fields
.field public final a:I

.field public final synthetic b:Lzi;


# direct methods
.method public constructor <init>(Lzi;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi;->b:Lzi;

    iput p2, p0, Lyi;->a:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 5

    iget-object v0, p0, Lyi;->b:Lzi;

    iget-object v1, v0, Lzi;->x:Lhi;

    iget v2, p0, Lyi;->a:I

    if-eqz v1, :cond_0

    if-gez v2, :cond_0

    invoke-virtual {v1}, Lhi;->c()Lzi;

    move-result-object v1

    const/4 v3, -0x1

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Lzi;->P(II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v4

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v2, v1}, Lzi;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    return p1
.end method
