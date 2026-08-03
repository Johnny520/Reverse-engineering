.class public LYue/ۥۣۡۨۤ$ۥ;
.super Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۨۤ;->onClick()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener<",
        "Lcom/kongzue/dialogx/dialogs/BottomMenu;",
        ">;"
    }
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;


# instance fields
.field public final synthetic ۥ:[Ljava/lang/String;

.field public final synthetic ۥ۟:LYue/ۥۣۡۨۤ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x15

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۡۨۤ;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۡۨۤ$ۥ;->ۥ۟:LYue/ۥۣۡۨۤ;

    iput-object p2, p0, LYue/ۥۣۡۨۤ$ۥ;->ۥ:[Ljava/lang/String;

    invoke-direct {p0}, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public bridge native synthetic onMultiItemSelect(Ljava/lang/Object;[Ljava/lang/CharSequence;[I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation
.end method

.method public native ۥ(Lcom/kongzue/dialogx/dialogs/BottomMenu;[Ljava/lang/CharSequence;[I)V
.end method
