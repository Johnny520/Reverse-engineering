.class public abstract Lci/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lci/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lci/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lci/x;->a:Lci/a;

    .line 7
    .line 8
    new-instance v0, Ll3/w;

    .line 9
    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ll3/w;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x12c

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-static {v1, v2, v0}, Li/d;->p(IILi/v;)Li/l1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0, v2}, Lh/m0;->a(Li/y;I)Lh/r0;

    .line 23
    .line 24
    .line 25
    new-instance v0, Ll3/w;

    .line 26
    .line 27
    const/16 v3, 0x15

    .line 28
    .line 29
    invoke-direct {v0, v3}, Ll3/w;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0xfa

    .line 33
    .line 34
    invoke-static {v3, v2, v0}, Li/d;->p(IILi/v;)Li/l1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, v2}, Lh/m0;->b(Li/l1;I)Lh/s0;

    .line 39
    .line 40
    .line 41
    sget-object v0, Lrh/a;->a:Lokio/a;

    .line 42
    .line 43
    invoke-static {v1, v2, v0}, Li/d;->p(IILi/v;)Li/l1;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1, v2}, Lh/m0;->a(Li/y;I)Lh/r0;

    .line 48
    .line 49
    .line 50
    const/16 v1, 0x96

    .line 51
    .line 52
    invoke-static {v1, v2, v0}, Li/d;->p(IILi/v;)Li/l1;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0, v2}, Lh/m0;->b(Li/l1;I)Lh/s0;

    .line 57
    .line 58
    .line 59
    return-void
.end method
