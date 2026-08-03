.class public final LYue/ۥ۠ۤۦۢ$ۥ۟۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:J

.field public final ۥ۟:Ljava/lang/String;

.field public final ۥ۟۟:Ljava/lang/String;

.field public final ۥ۟۟۟:Ljava/lang/String;

.field public final ۥ۟۟۟۟:Z

.field public final ۥ۟۟۟۠:J

.field public final ۥ۟۟۟ۡ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x308

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/reflect/Member;JZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LYue/ۥ۠ۤۦۢ$ۥ۟۟;->ۥ:J

    .line 4
    invoke-interface {p3}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۤۦۢ$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    .line 5
    invoke-interface {p3}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۤۦۢ$ۥ۟۟;->ۥ۟۟:Ljava/lang/String;

    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۤۦۢ$ۥ۟۟;->ۥ۟۟۟:Ljava/lang/String;

    .line 7
    instance-of p1, p3, Ljava/lang/reflect/Constructor;

    iput-boolean p1, p0, LYue/ۥ۠ۤۦۢ$ۥ۟۟;->ۥ۟۟۟۟:Z

    .line 8
    iput-wide p4, p0, LYue/ۥ۠ۤۦۢ$ۥ۟۟;->ۥ۟۟۟۠:J

    .line 9
    iput-boolean p6, p0, LYue/ۥ۠ۤۦۢ$ۥ۟۟;->ۥ۟۟۟ۡ:Z

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/reflect/Member;JZLYue/ۥ۠ۤۦۢ$ۥ;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LYue/ۥ۠ۤۦۢ$ۥ۟۟;-><init>(JLjava/lang/reflect/Member;JZ)V

    return-void
.end method


# virtual methods
.method public native ۥ()Ljava/lang/String;
.end method

.method public native ۥ۟()J
.end method

.method public native ۥ۟۟()J
.end method

.method public native ۥ۟۟۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟۠()Z
.end method

.method public native ۥ۟۟۟ۡ()Z
.end method
