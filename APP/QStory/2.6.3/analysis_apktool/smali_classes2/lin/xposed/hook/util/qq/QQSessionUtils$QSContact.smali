.class public Llin/xposed/hook/util/qq/QQSessionUtils$QSContact;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llin/xposed/hook/util/qq/QQSessionUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "QSContact"
.end annotation


# instance fields
.field public chatType:I

.field public peerUid:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Llin/xposed/hook/util/qq/QQSessionUtils$QSContact;->chatType:I

    .line 5
    .line 6
    iput-object p2, p0, Llin/xposed/hook/util/qq/QQSessionUtils$QSContact;->peerUid:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
