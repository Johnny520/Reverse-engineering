.class public LYue/ۥ۠ۧ۠ۢ$ۥ;
.super Ljava/lang/Object;

# interfaces
.implements LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۧ۠ۢ;->ۥ۟۟۟۠(Ljava/lang/String;ILYue/ۥۡۧۦ۠;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;


# instance fields
.field public final synthetic ۥ:LYue/ۥۡۧۦ۠;

.field public final synthetic ۥ۟:Ljava/lang/String;

.field public final synthetic ۥ۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x371

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۧۦ۠;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۧ۠ۢ$ۥ;->ۥ:LYue/ۥۡۧۦ۠;

    iput-object p2, p0, LYue/ۥ۠ۧ۠ۢ$ۥ;->ۥ۟:Ljava/lang/String;

    iput p3, p0, LYue/ۥ۠ۧ۠ۢ$ۥ;->ۥ۟۟:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public native ۥ۟(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟(Ljava/lang/String;)V
.end method
