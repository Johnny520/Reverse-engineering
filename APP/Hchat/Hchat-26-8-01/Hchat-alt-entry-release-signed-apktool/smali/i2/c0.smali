.class public final Li2/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv0/j;


# instance fields
.field public final synthetic g:Lfg/p;

.field public final synthetic h:Lfg/l;


# direct methods
.method public constructor <init>(Lfg/p;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li2/c0;->g:Lfg/p;

    .line 5
    .line 6
    iput-object p2, p0, Li2/c0;->h:Lfg/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Lv0/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c0;->g:Lfg/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c0;->h:Lfg/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
