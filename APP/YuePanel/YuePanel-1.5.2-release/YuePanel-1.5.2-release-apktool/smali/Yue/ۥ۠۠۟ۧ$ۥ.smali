.class public LYue/ۥ۠۠۟ۧ$ۥ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:[I

.field public ۥ۟:[I

.field public ۥ۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb0

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [I

    iput-object v0, p0, LYue/ۥ۠۠۟ۧ$ۥ;->ۥ:[I

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, LYue/ۥ۠۠۟ۧ$ۥ;->ۥ۟:[I

    iput v0, p0, LYue/ۥ۠۠۟ۧ$ۥ;->ۥ۟۟:I

    invoke-virtual {p0}, LYue/ۥ۠۠۟ۧ$ۥ;->ۥ۟۟۟()V

    return-void
.end method

.method public static native ۥ۟۟(II)I
.end method


# virtual methods
.method public final native ۥ([I)V
.end method

.method public final native ۥ۟()V
.end method

.method public native ۥ۟۟۟()V
.end method

.method public native ۥ۟۟۟۟([B)[B
.end method

.method public native ۥ۟۟۟۠([B)V
.end method
