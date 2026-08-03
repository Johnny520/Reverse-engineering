.class public final Lk/l0;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/e2;


# static fields
.field public static final v:Lk/b;


# instance fields
.field public final u:Lx1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk/l0;->v:Lk/b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lk/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lx1/j;

    .line 5
    .line 6
    iput-object p1, p0, Lk/l0;->u:Lx1/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final F()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lk/l0;->v:Lk/b;

    .line 2
    .line 3
    return-object v0
.end method
