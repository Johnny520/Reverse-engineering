.class public final Lsh/e1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;


# direct methods
.method public constructor <init>(Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsh/e1;->h:Li0/a1;

    .line 2
    .line 3
    iput-object p2, p0, Lsh/e1;->i:Li0/a1;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 6
    .line 7
    .line 8
    check-cast p3, Lwf/c;

    .line 9
    .line 10
    new-instance p1, Lsh/e1;

    .line 11
    .line 12
    iget-object p2, p0, Lsh/e1;->h:Li0/a1;

    .line 13
    .line 14
    iget-object v0, p0, Lsh/e1;->i:Li0/a1;

    .line 15
    .line 16
    invoke-direct {p1, p2, v0, p3}, Lsh/e1;-><init>(Li0/a1;Li0/a1;Lwf/c;)V

    .line 17
    .line 18
    .line 19
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lsh/e1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lsh/f1;->a:Li/r0;

    .line 5
    .line 6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    iget-object v0, p0, Lsh/e1;->h:Li0/a1;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lsh/e1;->i:Li0/a1;

    .line 14
    .line 15
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lfg/a;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object p1
.end method
