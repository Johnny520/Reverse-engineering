.class public final Li0/o1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/a1;
.implements Lqg/t;


# instance fields
.field public final synthetic g:Li0/a1;

.field public final h:Lwf/g;


# direct methods
.method public constructor <init>(Li0/a1;Lwf/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/o1;->g:Li0/a1;

    .line 5
    .line 6
    iput-object p2, p0, Li0/o1;->h:Lwf/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/o1;->g:Li0/a1;

    .line 2
    .line 3
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final n()Lwf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/o1;->h:Lwf/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/o1;->g:Li0/a1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
