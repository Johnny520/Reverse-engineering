.class public final synthetic LYue/ۥۡۡۦ۟;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic ۥ:Ljava/lang/String;

.field public final synthetic ۥ۟:Ljava/lang/String;

.field public final synthetic ۥ۟۟:I

.field public final synthetic ۥ۟۟۟:Ljava/lang/String;

.field public final synthetic ۥ۟۟۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2d0

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۦ۟;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۡۡۦ۟;->ۥ۟:Ljava/lang/String;

    iput p3, p0, LYue/ۥۡۡۦ۟;->ۥ۟۟:I

    iput-object p4, p0, LYue/ۥۡۡۦ۟;->ۥ۟۟۟:Ljava/lang/String;

    iput p5, p0, LYue/ۥۡۡۦ۟;->ۥ۟۟۟۟:I

    return-void
.end method


# virtual methods
.method public final native invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
