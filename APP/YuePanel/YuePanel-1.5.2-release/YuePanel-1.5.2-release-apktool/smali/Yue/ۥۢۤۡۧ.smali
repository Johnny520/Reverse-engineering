.class public final synthetic LYue/ۥۢۤۡۧ;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;


# instance fields
.field public final synthetic ۥ:Ljava/util/List;

.field public final synthetic ۥ۟:LYue/ۥۡۡۨ۟;

.field public final synthetic ۥ۟۟:I

.field public final synthetic ۥ۟۟۟:LYue/ۥ۠۟ۦ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x111

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;LYue/ۥۡۡۨ۟;ILYue/ۥ۠۟ۦ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۤۡۧ;->ۥ:Ljava/util/List;

    iput-object p2, p0, LYue/ۥۢۤۡۧ;->ۥ۟:LYue/ۥۡۡۨ۟;

    iput p3, p0, LYue/ۥۢۤۡۧ;->ۥ۟۟:I

    iput-object p4, p0, LYue/ۥۢۤۡۧ;->ۥ۟۟۟:LYue/ۥ۠۟ۦ;

    return-void
.end method


# virtual methods
.method public final native onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z
.end method
