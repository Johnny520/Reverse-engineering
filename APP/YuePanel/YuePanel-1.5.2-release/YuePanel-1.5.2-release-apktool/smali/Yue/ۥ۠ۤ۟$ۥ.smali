.class public LYue/ۥ۠ۤ۟$ۥ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;


# instance fields
.field public final ۥ:I

.field public final ۥ۟:I

.field public final ۥ۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x177

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥ۠ۤ۟$ۥ;->ۥ:I

    iput p2, p0, LYue/ۥ۠ۤ۟$ۥ;->ۥ۟:I

    iput p3, p0, LYue/ۥ۠ۤ۟$ۥ;->ۥ۟۟:I

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public native toString()Ljava/lang/String;
.end method
