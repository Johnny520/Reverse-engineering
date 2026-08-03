.class public abstract Lkotlinx/serialization/json/d;
.super Lkotlinx/serialization/json/b;
.source ""


# static fields
.field public static final Companion:Lkotlinx/serialization/json/JsonPrimitive$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/serialization/json/JsonPrimitive$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlinx/serialization/json/d;->Companion:Lkotlinx/serialization/json/JsonPrimitive$Companion;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
