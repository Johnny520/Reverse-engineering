.class public final Lgq;
.super Ljk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ldz0;

.field public i:I


# direct methods
.method public constructor <init>(Ldz0;Ljk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgq;->h:Ldz0;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lgq;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lgq;->i:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lgq;->i:I

    .line 9
    .line 10
    iget-object p1, p0, Lgq;->h:Ldz0;

    .line 11
    .line 12
    invoke-static {p1, p0}, Ldz0;->z0(Ldz0;Ljk;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
