.class public final Lk/q0;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Ln/h;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lk/t0;

.field public j:I


# direct methods
.method public constructor <init>(Lk/t0;Lyf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/q0;->i:Lk/t0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lyf/c;-><init>(Lwf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lk/q0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lk/q0;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lk/q0;->j:I

    .line 9
    .line 10
    iget-object p1, p0, Lk/q0;->i:Lk/t0;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lk/t0;->k1(Lk/t0;Lyf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
