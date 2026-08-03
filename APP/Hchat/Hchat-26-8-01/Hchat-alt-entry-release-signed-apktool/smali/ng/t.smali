.class public final Lng/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lng/j;


# instance fields
.field public final a:Lng/j;

.field public final b:Lfg/l;


# direct methods
.method public constructor <init>(Lng/j;Lfg/l;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lng/t;->a:Lng/j;

    .line 11
    .line 12
    iput-object p2, p0, Lng/t;->b:Lfg/l;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lng/s;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lng/s;-><init>(Lng/t;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
