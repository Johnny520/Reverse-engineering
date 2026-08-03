.class public final Li/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lf/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lf/l;->a:Lf/w;

    .line 5
    .line 6
    new-instance v0, Lf/w;

    .line 7
    .line 8
    invoke-direct {v0}, Lf/w;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Li/i0;->a:Lf/w;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Float;I)Li/h0;
    .locals 2

    .line 1
    new-instance v0, Li/h0;

    .line 2
    .line 3
    sget-object v1, Li/x;->b:Lg1/d;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Li/h0;-><init>(Ljava/lang/Float;Li/v;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Li/i0;->a:Lf/w;

    .line 9
    .line 10
    invoke-virtual {p1, p2, v0}, Lf/w;->h(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
