.class public final Lkotlinx/serialization/json/JsonNull;
.super Lkotlinx/serialization/json/d;
.source ""


# static fields
.field public static final INSTANCE:Lkotlinx/serialization/json/JsonNull;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/serialization/json/JsonNull;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "null"

    return-object v0
.end method

.method public final serializer()LQm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQm;"
        }
    .end annotation

    sget-object v0, LEm;->a:LEm;

    return-object v0
.end method
