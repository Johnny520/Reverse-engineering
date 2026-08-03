.class public final LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۠;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۤۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# instance fields
.field public final ۥ:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x281

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>([I)V
    .locals 0
    .param p1    # [I
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۠;->ۥ:[I

    return-void
.end method

.method public synthetic constructor <init>([ILYue/ۥۣ۠ۤۨ$ۥ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۠;-><init>([I)V

    return-void
.end method

.method public static native synthetic ۥ(LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۠;)I
.end method

.method public static native synthetic ۥ۟(LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۠;I)I
.end method


# virtual methods
.method public final native ۥ۟۟()I
.end method

.method public final native ۥ۟۟۟(I)I
.end method
