.class public Ltop/suzhelan/qstory/entity/PayItem;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private durationMonths:I

.field private name:Ljava/lang/String;

.field private payUrl:Ljava/lang/String;

.field private price:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getDurationMonths()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/PayItem;->durationMonths:I

    .line 2
    .line 3
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/PayItem;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPayUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/PayItem;->payUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPrice()D
    .locals 2

    .line 1
    iget-wide v0, p0, Ltop/suzhelan/qstory/entity/PayItem;->price:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public setDurationMonths(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltop/suzhelan/qstory/entity/PayItem;->durationMonths:I

    .line 2
    .line 3
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/PayItem;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPayUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/PayItem;->payUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPrice(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ltop/suzhelan/qstory/entity/PayItem;->price:D

    .line 2
    .line 3
    return-void
.end method
