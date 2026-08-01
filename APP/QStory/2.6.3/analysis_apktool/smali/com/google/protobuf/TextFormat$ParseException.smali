.class public Lcom/google/protobuf/TextFormat$ParseException;
.super Ljava/io/IOException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final serialVersionUID:J = 0x2c5b241b4d0ff6f6L


# instance fields
.field private final column:I

.field private final line:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ":"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, ": "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-direct {p0, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput p1, p0, Lcom/google/protobuf/TextFormat$ParseException;->line:I

    .line 37
    .line 38
    iput p2, p0, Lcom/google/protobuf/TextFormat$ParseException;->column:I

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, -0x1

    .line 41
    invoke-direct {p0, v0, v0, p1}, Lcom/google/protobuf/TextFormat$ParseException;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getColumn()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/TextFormat$ParseException;->column:I

    .line 2
    .line 3
    return p0
.end method

.method public getLine()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/TextFormat$ParseException;->line:I

    .line 2
    .line 3
    return p0
.end method
