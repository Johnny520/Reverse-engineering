.class public abstract Lh0/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li0/m2;

.field public static final b:Lh0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbi/c;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbi/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Li0/m2;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Li0/p1;-><init>(Lfg/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lh0/r;->a:Li0/m2;

    .line 14
    .line 15
    new-instance v0, Lh0/q;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lh0/r;->b:Lh0/q;

    .line 21
    .line 22
    return-void
.end method
