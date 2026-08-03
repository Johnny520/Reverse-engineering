.class public final Ljg/b;
.super Ljg/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Ld6/m;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld6/m;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ld6/m;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ljg/b;->h:Ld6/m;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final f()Ljava/util/Random;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg/b;->h:Ld6/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/util/Random;

    .line 11
    .line 12
    return-object v0
.end method
