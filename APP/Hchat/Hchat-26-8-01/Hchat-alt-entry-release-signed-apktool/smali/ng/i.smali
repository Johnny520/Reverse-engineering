.class public final Lng/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lng/j;


# instance fields
.field public final a:Lng/j;

.field public final b:Z

.field public final c:Lfg/l;


# direct methods
.method public constructor <init>(Lng/j;ZLfg/l;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lng/i;->a:Lng/j;

    .line 8
    .line 9
    iput-boolean p2, p0, Lng/i;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, Lng/i;->c:Lfg/l;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lng/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lng/h;-><init>(Lng/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
