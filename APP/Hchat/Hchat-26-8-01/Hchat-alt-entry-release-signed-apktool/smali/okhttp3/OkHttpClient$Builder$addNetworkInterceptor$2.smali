.class public final Lokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/OkHttpClient$Builder;->-addNetworkInterceptor(Lfg/l;)Lokhttp3/OkHttpClient$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $block:Lfg/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfg/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfg/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2;->$block:Lfg/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2;->$block:Lfg/l;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lokhttp3/Response;

    .line 11
    .line 12
    return-object p1
.end method
