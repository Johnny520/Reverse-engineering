.class public final Lug/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/e;


# instance fields
.field public final g:Lsg/p;


# direct methods
.method public constructor <init>(Lsg/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lug/n;->g:Lsg/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lug/n;->g:Lsg/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lsg/p;->q(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    return-object p1
.end method
