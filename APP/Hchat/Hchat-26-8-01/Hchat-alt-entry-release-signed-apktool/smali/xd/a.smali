.class public abstract Lxd/a;
.super Lmd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/n;


# static fields
.field public static final j:Lmh/b;


# instance fields
.field public i:Lud/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lxd/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lxd/a;->j:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lud/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxd/a;->i:Lud/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public i()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxd/a;->u()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lud/j;Lud/j;)Z
    .locals 1

    .line 1
    const-string p1, "Replace sub block not supported for class \"{}\""

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    sget-object v0, Lxd/a;->j:Lmh/b;

    .line 8
    .line 9
    invoke-interface {v0, p2, p1}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1
.end method
