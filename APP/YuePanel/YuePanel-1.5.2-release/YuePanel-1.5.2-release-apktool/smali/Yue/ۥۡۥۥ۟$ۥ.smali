.class public LYue/ۥۡۥۥ۟$ۥ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۥۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:Ljava/lang/String;

.field public ۥ۟۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥۡۥۥ۟$ۥ;->ۥ۟:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LYue/ۥۡۥۥ۟$ۥ;->ۥ۟۟:Ljava/lang/String;

    .line 5
    iput p4, p0, LYue/ۥۡۥۥ۟$ۥ;->ۥ۟۟۟:I

    .line 6
    iput-object p3, p0, LYue/ۥۡۥۥ۟$ۥ;->ۥ:Ljava/lang/String;

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public native toString()Ljava/lang/String;
.end method
