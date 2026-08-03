.class public final Li0/s0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/p2;


# instance fields
.field public final a:Lsf/i;


# direct methods
.method public constructor <init>(Lfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lbe/h;->H(Lfg/a;)Lsf/i;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Li0/s0;->a:Lsf/i;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ls0/h;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Li0/s0;->a:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {p1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
