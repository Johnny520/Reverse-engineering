.class public final Lsh/o1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic h:Ln/k;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/f1;


# direct methods
.method public constructor <init>(Ln/k;Li0/a1;Li0/a1;Li0/a1;Li0/f1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsh/o1;->h:Ln/k;

    .line 2
    .line 3
    iput-object p2, p0, Lsh/o1;->i:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lsh/o1;->j:Li0/a1;

    .line 6
    .line 7
    iput-object p4, p0, Lsh/o1;->k:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lsh/o1;->l:Li0/f1;

    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Le1/b;

    .line 4
    .line 5
    iget-wide p1, p2, Le1/b;->a:J

    .line 6
    .line 7
    move-object v6, p3

    .line 8
    check-cast v6, Lwf/c;

    .line 9
    .line 10
    new-instance v0, Lsh/o1;

    .line 11
    .line 12
    iget-object v4, p0, Lsh/o1;->k:Li0/a1;

    .line 13
    .line 14
    iget-object v5, p0, Lsh/o1;->l:Li0/f1;

    .line 15
    .line 16
    iget-object v1, p0, Lsh/o1;->h:Ln/k;

    .line 17
    .line 18
    iget-object v2, p0, Lsh/o1;->i:Li0/a1;

    .line 19
    .line 20
    iget-object v3, p0, Lsh/o1;->j:Li0/a1;

    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, Lsh/o1;-><init>(Ln/k;Li0/a1;Li0/a1;Li0/a1;Li0/f1;Lwf/c;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lsh/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ln/b;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lsh/o1;->h:Ln/k;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ln/k;->b(Ln/j;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lsh/o1;->i:Li0/a1;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lsh/o1;->j:Li0/a1;

    .line 20
    .line 21
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lsh/o1;->k:Li0/a1;

    .line 27
    .line 28
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lsh/o1;->l:Li0/f1;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Li0/f1;->h(F)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object p1
.end method
