.class public final Lokhttp3/internal/connection/RealCall$CallReference;
.super Ljava/lang/ref/WeakReference;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/connection/RealCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CallReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference<",
        "Lokhttp3/internal/connection/RealCall;",
        ">;"
    }
.end annotation


# instance fields
.field private final callStackTrace:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lokhttp3/internal/connection/RealCall$CallReference;->callStackTrace:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getCallStackTrace()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/RealCall$CallReference;->callStackTrace:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
