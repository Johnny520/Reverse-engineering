.class public final Log/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lng/j;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:Lfg/p;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;ILfg/p;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Log/c;->a:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iput p2, p0, Log/c;->b:I

    .line 10
    .line 11
    iput-object p3, p0, Log/c;->c:Lfg/p;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Log/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Log/b;-><init>(Log/c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
