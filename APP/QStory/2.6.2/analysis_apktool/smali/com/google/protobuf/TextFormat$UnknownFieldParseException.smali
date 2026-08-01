.class public Lcom/google/protobuf/TextFormat$UnknownFieldParseException;
.super Lcom/google/protobuf/TextFormat$ParseException;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final unknownField:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p4}, Lcom/google/protobuf/TextFormat$ParseException;-><init>(IILjava/lang/String;)V

    .line 9
    iput-object p3, p0, Lcom/google/protobuf/TextFormat$UnknownFieldParseException;->unknownField:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    invoke-direct {p0, v0, v0, v1, p1}, Lcom/google/protobuf/TextFormat$UnknownFieldParseException;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public getUnknownField()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/TextFormat$UnknownFieldParseException;->unknownField:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
