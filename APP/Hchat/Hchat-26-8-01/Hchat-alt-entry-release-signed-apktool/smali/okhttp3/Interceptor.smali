.class public interface abstract Lokhttp3/Interceptor;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Interceptor$Chain;,
        Lokhttp3/Interceptor$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/Interceptor$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/Interceptor$Companion;->$$INSTANCE:Lokhttp3/Interceptor$Companion;

    .line 2
    .line 3
    sput-object v0, Lokhttp3/Interceptor;->Companion:Lokhttp3/Interceptor$Companion;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public abstract intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
.end method
