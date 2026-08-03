.class public final enum L۟/g1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements L۟/w3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "L\u06df/g1;",
        ">;",
        "L\u06df/w3;"
    }
.end annotation


# static fields
.field public static final enum ۥ۟۠:L۟/g1;

.field public static final synthetic ۥ۟ۡ:[L۟/g1;


# instance fields
.field public final ۥ:Ljava/lang/Object;

.field public ۥ۟:Ljava/lang/String;

.field public final ۥ۟۟:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, L۟/g1;

    const/4 v1, 0x4

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    const/4 v3, 0x6

    new-array v4, v3, [B

    fill-array-data v4, :array_1

    invoke-static {v2, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v3, v3, [B

    fill-array-data v3, :array_3

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v2, v1, v3}, L۟/g1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    sput-object v0, L۟/g1;->ۥ۟۠:L۟/g1;

    const/4 v1, 0x1

    new-array v1, v1, [L۟/g1;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, L۟/g1;->ۥ۟ۡ:[L۟/g1;

    new-instance v0, L۟/q2;

    invoke-direct {v0, v1}, L۟/q2;-><init>([Ljava/lang/Enum;)V

    return-void

    nop

    :array_0
    .array-data 1
        0x5at
        -0x67t
        0x56t
        0x4at
    .end array-data

    :array_1
    .array-data 1
        0x14t
        -0x34t
        0x1at
        0x6t
        -0xdt
        0x49t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x10t
        0x23t
        -0x36t
        0x51t
    .end array-data

    :array_3
    .array-data 1
        0x7et
        0x56t
        -0x5at
        0x3dt
        0xdt
        0x55t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, L۟/g1;->ۥ:Ljava/lang/Object;

    iput-object p2, p0, L۟/g1;->ۥ۟:Ljava/lang/String;

    iput-object p3, p0, L۟/g1;->ۥ۟۟:Ljava/lang/Object;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)L۟/g1;
    .locals 1

    const-class v0, L۟/g1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, L۟/g1;

    return-object p0
.end method

.method public static values()[L۟/g1;
    .locals 1

    sget-object v0, L۟/g1;->ۥ۟ۡ:[L۟/g1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [L۟/g1;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, L۟/g1;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, L۟/g1;->ۥ۟۟:Ljava/lang/Object;

    return-object v0
.end method
