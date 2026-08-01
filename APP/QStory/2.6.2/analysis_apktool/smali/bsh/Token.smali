.class public Lbsh/Token;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public beginColumn:I

.field public beginLine:I

.field public endColumn:I

.field public endLine:I

.field public image:Ljava/lang/String;

.field public kind:I

.field public next:Lbsh/Token;

.field public specialToken:Lbsh/Token;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, v0}, Lbsh/Token;-><init>(ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lbsh/Token;->kind:I

    .line 5
    .line 6
    iput-object p2, p0, Lbsh/Token;->image:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static newToken(I)Lbsh/Token;
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-static {p0, v0}, Lbsh/Token;->newToken(ILjava/lang/String;)Lbsh/Token;

    move-result-object p0

    return-object p0
.end method

.method public static newToken(ILjava/lang/String;)Lbsh/Token;
    .locals 1

    .line 1
    new-instance v0, Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lbsh/Token;-><init>(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Token;->image:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
