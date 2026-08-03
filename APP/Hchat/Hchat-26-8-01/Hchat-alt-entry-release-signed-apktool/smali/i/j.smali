.class public final Li/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Li/m1;

.field public final b:Ljava/lang/Object;

.field public final c:J

.field public final d:Lfg/a;

.field public final e:Li0/j1;

.field public f:Li/q;

.field public g:J

.field public h:J

.field public final i:Li0/j1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Li/m1;Li/q;JLjava/lang/Object;JLfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Li/j;->a:Li/m1;

    .line 5
    .line 6
    iput-object p6, p0, Li/j;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p7, p0, Li/j;->c:J

    .line 9
    .line 10
    iput-object p9, p0, Li/j;->d:Lfg/a;

    .line 11
    .line 12
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Li/j;->e:Li0/j1;

    .line 17
    .line 18
    invoke-static {p3}, Li/d;->i(Li/q;)Li/q;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Li/j;->f:Li/q;

    .line 23
    .line 24
    iput-wide p4, p0, Li/j;->g:J

    .line 25
    .line 26
    const-wide/high16 p1, -0x8000000000000000L

    .line 27
    .line 28
    iput-wide p1, p0, Li/j;->h:J

    .line 29
    .line 30
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Li/j;->i:Li0/j1;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Li/j;->i:Li0/j1;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li/j;->d:Lfg/a;

    .line 9
    .line 10
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method
