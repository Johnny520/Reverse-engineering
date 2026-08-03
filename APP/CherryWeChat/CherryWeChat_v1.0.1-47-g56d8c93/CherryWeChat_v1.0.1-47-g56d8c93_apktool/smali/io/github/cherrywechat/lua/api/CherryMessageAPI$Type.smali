.class public final Lio/github/cherrywechat/lua/api/CherryMessageAPI$Type;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/api/CherryMessageAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Type"
.end annotation


# static fields
.field public static final CARD:I = 0x31

.field public static final EMOJI:I = 0x2f

.field public static final FILE:I = 0x41000031

.field public static final IMAGE:I = 0x3

.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI$Type;

.field public static final LINK:I = 0x31

.field public static final LOCATION:I = 0x30

.field public static final NEW_YEAR_RED:I = 0x1c000031

.field public static final RED_PACKET:I = 0x1a000031

.field public static final REPLY:I = 0x31000031

.field public static final TEXT:I = 0x1

.field public static final TIP:I = 0x2710

.field public static final TRANSFER:I = 0x19000031

.field public static final VIDEO:I = 0x2b

.field public static final VOICE:I = 0x22


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI$Type;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$Type;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI$Type;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI$Type;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
