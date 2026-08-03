.class public final Ltg/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/d;


# instance fields
.field public final g:Ltg/d;


# direct methods
.method public constructor <init>(Ltg/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltg/c;->g:Ltg/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ltg/e;Lwf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lgg/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lug/c;->b:Ll3/q;

    .line 7
    .line 8
    iput-object v1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, Lh0/l0;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0, p1}, Lh0/l0;-><init>(Ltg/c;Lgg/u;Ltg/e;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ltg/c;->g:Ltg/d;

    .line 16
    .line 17
    invoke-interface {p1, v1, p2}, Ltg/d;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 22
    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object p1
.end method
