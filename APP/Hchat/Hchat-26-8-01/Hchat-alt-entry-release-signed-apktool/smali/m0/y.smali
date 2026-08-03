.class public final Lm0/y;
.super Lm0/j0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lm0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lm0/y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, Lm0/j0;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lm0/y;->c:Lm0/y;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lh0/s;Li0/a;Ll0/k;Lb5/i;Lm0/k0;)V
    .locals 0

    .line 1
    iget p1, p3, Ll0/k;->t:I

    .line 2
    .line 3
    new-instance p2, Lb0/t;

    .line 4
    .line 5
    const/16 p5, 0x8

    .line 6
    .line 7
    invoke-direct {p2, p4, p5}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p1, p2}, Ll0/k;->n(ILfg/p;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Ll0/k;->H()Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
