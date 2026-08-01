.class public final Lgg0;
.super Ljk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public g:Llz0;

.field public h:Lwt0;

.field public i:F

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lfn;

.field public l:I


# direct methods
.method public constructor <init>(Lfn;Ljk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgg0;->k:Lfn;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljk;-><init>(Lik;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iput-object p1, p0, Lgg0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lgg0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lgg0;->l:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, Lgg0;->k:Lfn;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-static/range {v0 .. v5}, Lfn;->a(Lfn;Llz0;Lfg0;FFLjk;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
