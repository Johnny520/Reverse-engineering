.class Lkevin/fun/hook/DexKitFinder$SafeFinder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/DexKitFinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SafeFinder"
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field private final bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field private final classLoader:Ljava/lang/ClassLoader;

.field private final context:Landroid/content/Context;

.field private final failedItems:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x182e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->short:[S

    return-void

    :array_0
    .array-data 2
        0x38es
        0x382s
        0x38as
        0x38ds
        0x39cs
        0x397s
        0x382s
        0x381s
        0x39cs
        0x38fs
        0x382s
        0x39as
        0x38cs
        0x396s
        0x397s
        0x39cs
        0x380s
        0x38fs
        0x382s
        0x390s
        0x390s
        0xcces
        0xcc2s
        0xccas
        0xccds
        0xcdcs
        0xcd7s
        0xcc2s
        0xcc1s
        0xcdcs
        0xccfs
        0xcc2s
        0xcdas
        0xcccs
        0xcd6s
        0xcd7s
        0xcdcs
        0xcces
        0xcc6s
        0xcd7s
        0xccbs
        0xcccs
        0xcc7s
        0x2bfs
        0x2b7s
        0x2a1s
        0x2a1s
        0x2b3s
        0x2b5s
        0x2b7s
        0x2ads
        0x2bas
        0x2b3s
        0x2bcs
        0x2b6s
        0x2bes
        0x2b7s
        0x2a0s
        0x2ads
        0x2b1s
        0x2bes
        0x2b3s
        0x2a1s
        0x2a1s
        0xc74s
        0xc78s
        0xc7as
        0xc7as
        0xc72s
        0xc79s
        0xc63s
        0xc68s
        0xc71s
        0xc65s
        0xc76s
        0xc70s
        0xc7as
        0xc72s
        0xc79s
        0xc63s
        0xc68s
        0xc74s
        0xc7bs
        0xc76s
        0xc64s
        0xc64s
        0x7c0s
        0x7f7s
        0x7ffs
        0x7fds
        0x7e4s
        0x7f7s
        0x7cds
        0x7d3s
        0x7f1s
        0x7e6s
        0x7fbs
        0x7fds
        0x7fcs
        0x7d0s
        0x7f3s
        0x7e0s
        0xb24s
        0xb33s
        0xb37s
        0xb32s
        0xb29s
        0xb32s
        0xb39s
        0xb3bs
        0xb37s
        0xb24s
        0xb3ds
        0xc6as
        0xc7ds
        0xc79s
        0xc7cs
        0xc67s
        0xc7cs
        0xc77s
        0xc6as
        0xc7ds
        0xc69s
        0xc6ds
        0xc7ds
        0xc6bs
        0xc6cs
        0x311s
        0x314s
        0x30bs
        0x318s
        0x302s
        0x313s
        0x308s
        0x310s
        0x31fs
        0x318s
        0x30fs
        0x65as
        0x66cs
        0x667s
        0x66ds
        0x644s
        0x67as
        0x66es
        0x641s
        0x668s
        0x667s
        0x66ds
        0x665s
        0x66cs
        0x67bs
        0xbc6s
        0xbf9s
        0xbf4s
        0xbf5s
        0xbffs
        0xbc6s
        0xbf9s
        0xbf5s
        0xbe7s
        0xbd8s
        0xbffs
        0xbfcs
        0xbf4s
        0xbf5s
        0xbe2s
        0xbcfs
        0xbf2s
        0xbf9s
        0xbfes
        0xbf4s
        0xc4es
        0xc6ds
        0xc6fs
        0xc67s
        0xc53s
        0xc5es
        0xc69s
        0xc6as
        0xc7es
        0xc69s
        0xc7fs
        0xc64s
        0xa9fs
        0xab4s
        0xaaes
        0xab9s
        0xab7s
        0xabes
        0xa84s
        0xab6s
        0xabes
        0xaafs
        0xab3s
        0xab4s
        0xabfs
        0x499s
        0x492s
        0x49cs
        0x484s
        0x49es
        0x496s
        0x494s
        0x491s
        0x492s
        0x484s
        0x498s
        0x497s
        0x49as
        0x488s
        0x488s
        0x453s
        0x447s
        0x446s
        0x45ds
        0x44ds
        0x442s
        0x45es
        0x453s
        0x44bs
        0x44ds
        0x451s
        0x45es
        0x453s
        0x441s
        0x441s
        0x408s
        0x42es
        0x438s
        0x42fs
        0x414s
        0x433s
        0x43bs
        0x432s
        0x402s
        0x41es
        0x411s
        0x41cs
        0x40es
        0x40es
        0xcfes
        0xcf1s
        0xcebs
        0xcf6s
        0xce0s
        0xcf0s
        0xce9s
        0xcfas
        0xceds
        0xcf9s
        0xcf3s
        0xcf0s
        0xce8s
        0x105s
        0x12es
        0x13cs
        0x109s
        0x10cs
        0x108s
        0x12es
        0x127s
        0x127s
        0x118s
        0x13fs
        0x12as
        0x13fs
        0x12es
        0x313s
        0x325s
        0x32es
        0x324s
        0x30ds
        0x333s
        0x327s
        0x308s
        0x321s
        0x32es
        0x324s
        0x32cs
        0x325s
        0x332s
        0x333s
        0x306s
        0x32as
        0x339s
        0x320s
        0x339s
        0x32es
        0x32as
        0x32fs
        0x314s
        0x308s
        0x307s
        0x30as
        0x318s
        0x318s
        0x84es
        0x874s
        0x870s
        0x84ds
        0x871s
        0x87cs
        0x864s
        0x878s
        0x86fs
        0x842s
        0x85es
        0x871s
        0x87cs
        0x86es
        0x86es
        0x4e8s
        0x4efs
        0x4eds
        0x4e5s
        0x4f0s
        0x4e1s
        0x4e7s
        0x4e5s
        0x4ffs
        0x4f4s
        0x4e9s
        0x4eds
        0x4e5s
        0x4ffs
        0x4e3s
        0x4ecs
        0x4e1s
        0x4f3s
        0x4f3s
        0xc1ds
        0xc1as
        0xc18s
        0xc10s
        0xc05s
        0xc14s
        0xc12s
        0xc10s
        0xc0as
        0xc01s
        0xc1cs
        0xc18s
        0xc10s
        0xc0as
        0xc38s
        0xc30s
        0xc21s
        0xc3ds
        0xc3as
        0xc31s
        0xb1as
        0xb15s
        0xb0fs
        0xb12s
        0xb04s
        0xb14s
        0xb0ds
        0xb1es
        0xb09s
        0xb1ds
        0xb17s
        0xb14s
        0xb0cs
        0xb04s
        0xb16s
        0xb1es
        0xb0fs
        0xb13s
        0xb14s
        0xb0fs
        0x1cfs
        0x1c2s
        0x1d9s
        0x1d9s
        0x1c2s
        0x1c0s
        0x1d2s
        0x1d9s
        0x1ccs
        0x1cfs
        0x1d2s
        0x1ces
        0x1c1s
        0x1ccs
        0x1des
        0x1des
        0x75ds
        0x740s
        0x744s
        0x74cs
        0x75cs
        0x75ds
        0x740s
        0x745s
        0x75as
        0x756s
        0x74as
        0x745s
        0x748s
        0x75as
        0x75as
        0xaees
        0xacbs
        0xad4s
        0xac7s
        0xaf1s
        0xadbs
        0xaccs
        0xad6s
        0xacas
        0xac7s
        0xad1s
        0xacbs
        0xad1s
        0xafds
        0xae1s
        0xaees
        0xae3s
        0xaf1s
        0xaf1s
        0x216s
        0x21fs
        0x202s
        0x213s
        0x215s
        0x20fs
        0x213s
        0x21cs
        0x211s
        0x203s
        0x203s
        0x219s
        0x213s
        0x29as
        0x299s
        0x299s
        0x298s
        0x283s
        0x29es
        0x293s
        0x288s
        0x288s
        0x293s
        0x291s
        0x283s
        0x29es
        0x29ds
        0x28es
        0x283s
        0x29fs
        0x293s
        0x292s
        0x288s
        0x29ds
        0x295s
        0x292s
        0x299s
        0x28es
        0x283s
        0x291s
        0x299s
        0x288s
        0x294s
        0x293s
        0x298s
        0x669s
        0x611s
        0x618s
        0x66es
        0x67fs
        0x675s
        0x669s
        0x67fs
        0x66bs
        0x669s
        0x674s
        0x67fs
        0x663s
        0x66cs
        0x661s
        0x673s
        0x673s
        0x41es
        0x427s
        0x421s
        0x42bs
        0x42ds
        0x40es
        0x421s
        0x424s
        0x42ds
        0x417s
        0x425s
        0x42ds
        0x43cs
        0x420s
        0x427s
        0x42cs
        0x279s
        0x240s
        0x246s
        0x24cs
        0x24as
        0x269s
        0x246s
        0x243s
        0x24as
        0x270s
        0x26cs
        0x263s
        0x26es
        0x27cs
        0x27cs
        0x6c0s
        0x6f4s
        0x6e5s
        0x6e8s
        0x6ees
        0x6d3s
        0x6e4s
        0x6e2s
        0x6ees
        0x6f3s
        0x6e5s
        0x6d2s
        0x6f5s
        0x6e0s
        0x6f5s
        0x6f4s
        0x6f2s
        0x6des
        0x6c2s
        0x6cds
        0x6c0s
        0x6d2s
        0x6d2s
        0x465s
        0x47ds
        0x47fs
        0x478s
        0x469s
        0x477s
        0x472s
        0x469s
        0x475s
        0x47es
        0x477s
        0x466s
        0x462s
        0x473s
        0x464s
        0x1c3s
        0x1efs
        0x1eds
        0x1eds
        0x1e5s
        0x1ees
        0x1f4s
        0x1c8s
        0x1e5s
        0x1e1s
        0x1e4s
        0x1e5s
        0x1f2s
        0x1d7s
        0x1e9s
        0x1e4s
        0x1e7s
        0x1e5s
        0x1f4s
        0x1dfs
        0x1eds
        0x1e5s
        0x1f4s
        0x1e8s
        0x1efs
        0x1e4s
        0x80as
        0x826s
        0x824s
        0x824s
        0x82cs
        0x827s
        0x83ds
        0x820s
        0x827s
        0x839s
        0x83cs
        0x83ds
        0x816s
        0x824s
        0x82cs
        0x83ds
        0x821s
        0x826s
        0x82ds
        0x595s
        0x5b9s
        0x5bbs
        0x5bbs
        0x5b3s
        0x5b8s
        0x5a2s
        0x586s
        0x5b7s
        0x5b1s
        0x5b3s
        0x59es
        0x5b3s
        0x5b7s
        0x5b2s
        0x5b3s
        0x5a4s
        0x59bs
        0x5b9s
        0x5b2s
        0x5a3s
        0x5bas
        0x5b3s
        0x589s
        0x59bs
        0x593s
        0x582s
        0x59es
        0x599s
        0x592s
        0x807s
        0x82cs
        0x83es
        0x80bs
        0x82es
        0x80as
        0x826s
        0x827s
        0x83ds
        0x82cs
        0x827s
        0x83ds
        0x80as
        0x82cs
        0x825s
        0x825s
        0x81cs
        0x800s
        0x816s
        0x804s
        0x80cs
        0x81ds
        0x801s
        0x806s
        0x80ds
        0x72ds
        0x72ds
        0x72ds
        0x733s
        0x721s
        0x729s
        0x738s
        0x724s
        0x723s
        0x728s
        0x62es
        0x631s
        0x63cs
        0x63ds
        0x637s
        0x627s
        0x63es
        0x631s
        0x63ds
        0x634s
        0x63cs
        0x62bs
        0x2c8s
        0x2d7s
        0x2das
        0x2dbs
        0x2d1s
        0x2c1s
        0x2das
        0x2cbs
        0x2ccs
        0x2dfs
        0x2cas
        0x2d7s
        0x2d1s
        0x2d0s
        0x2c1s
        0x2d8s
        0x2d7s
        0x2dbs
        0x2d2s
        0x2das
        0xbf6s
        0xbcds
        0xbd4s
        0xbd7s
        0xbe5s
        0xbc0s
        0xbc5s
        0xbd4s
        0xbd0s
        0xbc1s
        0xbd6s
        0xbfbs
        0xbc9s
        0xbc1s
        0xbd0s
        0xbccs
        0xbcbs
        0xbc0s
        0x312s
        0x337s
        0x332s
        0x323s
        0x327s
        0x336s
        0x321s
        0x362s
        0x30cs
        0x310s
        0x31fs
        0x312s
        0x300s
        0x300s
        0x473s
        0x456s
        0x453s
        0x442s
        0x446s
        0x457s
        0x440s
        0x400s
        0x46ds
        0x471s
        0x47es
        0x473s
        0x461s
        0x461s
        0x2f8s
        0x2dds
        0x2d8s
        0x2c9s
        0x2cds
        0x2dcs
        0x2cbs
        0x28as
        0x2e6s
        0x2fas
        0x2f5s
        0x2f8s
        0x2eas
        0x2eas
        0x38as
        0x3afs
        0x3aas
        0x3bbs
        0x3bfs
        0x3aes
        0x3b9s
        0x3ffs
        0x394s
        0x388s
        0x387s
        0x38as
        0x398s
        0x398s
        0x517s
        0x501s
        0x510s
        0x51bs
        0x500s
        0x505s
        0x510s
        0x505s
        0x51bs
        0x509s
        0x501s
        0x510s
        0x50cs
        0x50bs
        0x500s
        0xb05s
        0xb26s
        0xb34s
        0xb22s
        0xb14s
        0xb22s
        0xb34s
        0xb34s
        0xb2es
        0xb28s
        0xb29s
        0xb11s
        0xb2es
        0xb22s
        0xb30s
        0xb0fs
        0xb28s
        0xb2bs
        0xb23s
        0xb22s
        0xb35s
        0xb18s
        0xb2as
        0xb22s
        0xb33s
        0xb2fs
        0xb28s
        0xb23s
        0x429s
        0x42as
        0x438s
        0x42es
        0x434s
        0x42as
        0x42fs
        0x42as
        0x43bs
        0x43fs
        0x42es
        0x439s
        0x434s
        0x426s
        0x42es
        0x43fs
        0x423s
        0x424s
        0x42fs
        0x724s
        0x72cs
        0x731s
        0x735s
        0x738s
        0x73es
        0x732s
        0x734s
        0x723s
        0x73es
        0x722s
        0x72ds
        0x720s
        0x732s
        0x732s
        0x3eds
        0x3ebs
        0x3fds
        0x3eas
        0x3e7s
        0x3f1s
        0x3f6s
        0x3fes
        0x3f7s
        0x3e7s
        0x3fbs
        0x3f4s
        0x3f9s
        0x3ebs
        0x3ebs
        0xae6s
        0xae0s
        0xaf6s
        0xae1s
        0xaecs
        0xafes
        0xafcs
        0xaf7s
        0xaf6s
        0xaffs
        0xaecs
        0xaf0s
        0xaffs
        0xaf2s
        0xae0s
        0xae0s
        0x58as
        0x5bcs
        0x5b1s
        0x5b1s
        0x5ads
        0x5bcs
        0x5ads
        0x5b8s
        0x5afs
        0x590s
        0x5bcs
        0x5aes
        0x5b6s
        0x59es
        0x5b8s
        0x5b1s
        0x5b1s
        0x588s
        0x594s
        0x582s
        0x590s
        0x598s
        0x589s
        0x595s
        0x592s
        0x599s
        0xaf3s
        0xaebs
        0xaf2s
        0xaeas
        0xaf7s
        0xae1s
        0xafas
        0xae7s
        0xaf0s
        0xaffs
        0xaf3s
        0xaf7s
        0xafds
        0xae1s
        0xaf7s
        0xafds
        0xaf1s
        0xaf0s
        0xae1s
        0xafds
        0xafbs
        0xaf2s
        0xaf2s
        0xae1s
        0xaebs
        0xaf7s
        0xae1s
        0xaf3s
        0xafbs
        0xaeas
        0xaf6s
        0xaf1s
        0xafas
        0x84ds
        0x87as
        0x86cs
        0x86fs
        0x870s
        0x871s
        0x86cs
        0x87as
        0x85es
        0x87bs
        0x87es
        0x86fs
        0x86bs
        0x87as
        0x86ds
        0x840s
        0x85cs
        0x853s
        0x85es
        0x84cs
        0x84cs
        0x679s
        0x67ds
        0x66fs
        0x663s
        0x675s
        0x663s
        0x663s
        0x679s
        0x67fs
        0x67es
        0x66fs
        0x67ds
        0x67fs
        0x674s
        0x675s
        0x67cs
        0x66fs
        0x673s
        0x67cs
        0x671s
        0x663s
        0x663s
        0xce8s
        0xce0s
        0xcf6s
        0xcf6s
        0xce4s
        0xce2s
        0xce0s
        0xcfas
        0xcf6s
        0xce0s
        0xcf1s
        0xcfas
        0xce9s
        0xceas
        0xce6s
        0xce4s
        0xce9s
        0xcfas
        0xce0s
        0xcfds
        0xcf1s
        0xcfas
        0xce8s
        0xce0s
        0xcf1s
        0xceds
        0xceas
        0xce1s
        0x44es
        0x44ds
        0x45fs
        0x449s
        0x453s
        0x44fs
        0x443s
        0x442s
        0x458s
        0x449s
        0x442s
        0x458s
        0x453s
        0x441s
        0x449s
        0x458s
        0x444s
        0x443s
        0x448s
        0x5d5s
        0x5d6s
        0x5c4s
        0x5d2s
        0x5c8s
        0x5d4s
        0x5d8s
        0x5d9s
        0x5c3s
        0x5d2s
        0x5d9s
        0x5c3s
        0x5c8s
        0x5c3s
        0x5c5s
        0x5c2s
        0x5d2s
        0x5c8s
        0x5das
        0x5d2s
        0x5c3s
        0x5dfs
        0x5d8s
        0x5d3s
        0x386s
        0x3acs
        0x3b5s
        0x3b8s
        0x390s
        0x3a1s
        0x3a7s
        0x3a5s
        0x390s
        0x3a1s
        0x3b2s
        0x3a1s
        0x3ads
        0x3b3s
        0x39fs
        0x383s
        0x38cs
        0x381s
        0x393s
        0x393s
        0xa28s
        0xa25s
        0xa3es
        0xa3es
        0xa25s
        0xa27s
        0xa35s
        0xa3es
        0xa2bs
        0xa28s
        0xa35s
        0xa27s
        0xa2fs
        0xa3es
        0xa22s
        0xa25s
        0xa2es
        0x12es
        0x126s
        0x124s
        0x121s
        0x122s
        0x134s
        0x123s
        0x102s
        0x10fs
        0x10es
        0x134s
        0x126s
        0x12es
        0x13fs
        0x123s
        0x124s
        0x12fs
        0xa98s
        0xa94s
        0xa96s
        0xa96s
        0xa9es
        0xa95s
        0xa8fs
        0xa84s
        0xa99s
        0xa9cs
        0xc1as
        0xc1es
        0xc0cs
        0xc15s
        0xc3cs
        0xc21s
        0xc24s
        0xc32s
        0xc21s
        0xc37s
        0xc0cs
        0xc12s
        0xc30s
        0xc27s
        0xc3as
        0xc3cs
        0xc3ds
        0xc0cs
        0xc10s
        0xc3fs
        0xc32s
        0xc20s
        0xc20s
        0x8afs
        0x8a7s
        0x8b1s
        0x8b1s
        0x8a3s
        0x8a5s
        0x8a7s
        0x8bds
        0x8a4s
        0x8abs
        0x8a7s
        0x8aes
        0x8a6s
        0x8bds
        0x8acs
        0x8a3s
        0x8afs
        0x8a7s
        0x74ds
        0x776s
        0x77fs
        0x76cs
        0x77bs
        0x74es
        0x77fs
        0x77ds
        0x775s
        0x77fs
        0x779s
        0x77bs
        0x741s
        0x74ds
        0x76as
        0x77fs
        0x76as
        0x777s
        0x77ds
        0x741s
        0x75ds
        0x76cs
        0x77bs
        0x77fs
        0x76as
        0x771s
        0x76cs
        0xc2es
        0xc33s
        0xc37s
        0xc3fs
        0xc25s
        0xc39s
        0xc35s
        0xc37s
        0xc2as
        0xc35s
        0xc34s
        0xc3fs
        0xc34s
        0xc2es
        0xc25s
        0xc2fs
        0xc2as
        0xc3es
        0xc3bs
        0xc2es
        0xc3fs
        0xc25s
        0xc37s
        0xc3fs
        0xc2es
        0xc32s
        0xc35s
        0xc3es
        0x689s
        0x694s
        0x690s
        0x698s
        0x682s
        0x692s
        0x68fs
        0x682s
        0x68fs
        0x698s
        0x689s
        0x68fs
        0x684s
        0x682s
        0x689s
        0x698s
        0x685s
        0x689s
        0x682s
        0x68bs
        0x694s
        0x698s
        0x68as
        0x682s
        0x69bs
        0x694s
        0x698s
        0x691s
        0x699s
        0x33as
        0x339s
        0x32bs
        0x33ds
        0x327s
        0x334s
        0x331s
        0x32bs
        0x32cs
        0x327s
        0x33es
        0x32as
        0x339s
        0x33fs
        0x335s
        0x33ds
        0x336s
        0x32cs
        0x327s
        0x328s
        0x339s
        0x336s
        0x33ds
        0x334s
        0x327s
        0x32es
        0x331s
        0x33ds
        0x32fs
        0x327s
        0x328s
        0x339s
        0x33fs
        0x33ds
        0x32as
        0x327s
        0x33es
        0x331s
        0x33ds
        0x334s
        0x33cs
        0x632s
        0x62fs
        0x62bs
        0x623s
        0x639s
        0x629s
        0x634s
        0x639s
        0x634s
        0x623s
        0x632s
        0x634s
        0x63fs
        0x639s
        0x625s
        0x609s
        0x60bs
        0x60bs
        0x625s
        0x609s
        0x60bs
        0x60bs
        0x603s
        0x608s
        0x612s
        0x795s
        0x7b0s
        0x7afs
        0x7bcs
        0x78bs
        0x7b6s
        0x7b6s
        0x7b4s
        0x798s
        0x7acs
        0x7bds
        0x7b0s
        0x7bcs
        0x7b7s
        0x7bas
        0x7bcs
        0x78es
        0x7b0s
        0x7bds
        0x7bes
        0x7bcs
        0x7ads
        0x786s
        0x78cs
        0x7a9s
        0x7bds
        0x7b8s
        0x7ads
        0x7bcs
        0x78ds
        0x7bcs
        0x7a1s
        0x7ads
        0x786s
        0x794s
        0x7bcs
        0x7ads
        0x7b1s
        0x7b6s
        0x7bds
        0xb54s
        0xb57s
        0xb57s
        0xb56s
        0xb4ds
        0xb50s
        0xb57s
        0xb5es
        0xb5es
        0xb5ds
        0xb45s
        0xb4ds
        0xb56s
        0xb57s
        0xb41s
        0xb51s
        0xb4ds
        0xb46s
        0xb5bs
        0xb5fs
        0xb57s
        0x1c1s
        0x1c2s
        0x1c2s
        0x1c3s
        0x1d8s
        0x1c5s
        0x1c2s
        0x1cbs
        0x1cbs
        0x1c8s
        0x1d0s
        0x1d8s
        0x1c3s
        0x1c2s
        0x1d4s
        0x1c4s
        0x1d8s
        0x1d3s
        0x1ces
        0x1cas
        0x1c2s
        0x1d8s
        0x1d1s
        0x1ces
        0x1d4s
        0x1ces
        0x1c5s
        0x1ces
        0x1cbs
        0x1ces
        0x1d3s
        0x1des
        0x90cs
        0x92bs
        0x929s
        0x921s
        0x910s
        0x925s
        0x926s
        0x90ds
        0x930s
        0x921s
        0x929s
        0x587s
        0x59cs
        0x595s
        0x586s
        0x591s
        0x58bs
        0x599s
        0x591s
        0x59as
        0x581s
        0x8efs
        0x8e7s
        0x8e5s
        0x8e0s
        0x8e3s
        0x8f5s
        0x8e9s
        0x8e6s
        0x8ebs
        0x8f9s
        0x8f9s
        0x57ds
        0x571s
        0x573s
        0x573s
        0x57bs
        0x570s
        0x56as
        0x561s
        0x577s
        0x570s
        0x56as
        0x57bs
        0x56cs
        0x57fs
        0x57ds
        0x56as
        0x577s
        0x571s
        0x570s
        0x561s
        0x57as
        0x57bs
        0x572s
        0x57bs
        0x579s
        0x57fs
        0x56as
        0x57bs
        0x727s
        0x731s
        0x723s
        0x72bs
        0x723s
        0x739s
        0x734s
        0x727s
        0x731s
        0x739s
        0x727s
        0x722s
        0x739s
        0x723s
        0x734s
        0x734s
        0x729s
        0x734s
        0x739s
        0x725s
        0x72as
        0x727s
        0x735s
        0x735s
        0x784s
        0x780s
        0x792s
        0x78as
        0x788s
        0x799s
        0x792s
        0x789s
        0x78cs
        0x799s
        0x78cs
        0x792s
        0x780s
        0x788s
        0x799s
        0x785s
        0x782s
        0x789s
        0xa1ds
        0xa38s
        0xa3ds
        0xa2cs
        0xa28s
        0xa39s
        0xa2es
        0xa68s
        0xa03s
        0xa15s
        0xa11s
        0xa03s
        0xa09s
        0xa0fs
        0xa19s
        0xa0es
        0xa03s
        0xa1as
        0xa15s
        0xa19s
        0xa10s
        0xa18s
        0x8c5s
        0x8c7s
        0x8d6s
        0x8dds
        0x8d6s
        0x8c3s
        0x8c0s
        0x8dds
        0x8cbs
        0x8c6s
        0x8dds
        0x8cfs
        0x8c7s
        0x8d6s
        0x8cas
        0x8cds
        0x8c6s
        0x4a8s
        0x4bes
        0x4acs
        0x4a4s
        0x4acs
        0x4b6s
        0x4bbs
        0x4a8s
        0x4bes
        0x4b6s
        0x4a8s
        0x4ads
        0x4b6s
        0x4acs
        0x4bbs
        0x4bbs
        0x4a6s
        0x4bbs
        0x4b6s
        0x4a4s
        0x4acs
        0x4bds
        0x4a1s
        0x4a6s
        0x4ads
        0xa2cs
        0xa37s
        0xa3es
        0xa2ds
        0xa3as
        0xa20s
        0xa32s
        0xa3as
        0xa31s
        0xa2as
        0xa20s
        0xa32s
        0xa3as
        0xa2bs
        0xa37s
        0xa30s
        0xa3bs
        0x10bs
        0x123s
        0x121s
        0x124s
        0x127s
        0x111s
        0x103s
        0x12bs
        0x13as
        0x126s
        0x121s
        0x12as
        0xa6fs
        0xa74s
        0xa6es
        0xa78s
        0xa73s
        0xa64s
        0xa77s
        0xa72s
        0xa68s
        0xa6fs
        0xa7es
        0xa75s
        0xa7es
        0xa69s
        0xa64s
        0xa78s
        0xa77s
        0xa7as
        0xa68s
        0xa68s
        0x7c0s
        0x7cfs
        0x7c5s
        0x7d3s
        0x7ces
        0x7c8s
        0x7c5s
        0x78fs
        0x7d7s
        0x7c8s
        0x7c4s
        0x7d6s
        0x78fs
        0x7f7s
        0x7c8s
        0x7c4s
        0x7d6s
        0x9d8s
        0x9d7s
        0x9dds
        0x9cbs
        0x9d6s
        0x9d0s
        0x9dds
        0x997s
        0x9das
        0x9d6s
        0x9d7s
        0x9cds
        0x9dcs
        0x9d7s
        0x9cds
        0x997s
        0x9fas
        0x9d6s
        0x9d7s
        0x9cds
        0x9dcs
        0x9c1s
        0x9cds
        0x31cs
        0x313s
        0x319s
        0x30fs
        0x312s
        0x314s
        0x319s
        0x353s
        0x30bs
        0x314s
        0x318s
        0x30as
        0x353s
        0x32bs
        0x314s
        0x318s
        0x30as
        0x33as
        0x30fs
        0x312s
        0x308s
        0x30ds
        0x533s
        0x52as
        0x52cs
        0x521s
        0x980s
        0x987s
        0x99ds
        0x367s
        0x36cs
        0x37bs
        0x36cs
        0x323s
        0x378s
        0x379s
        0x364s
        0x361s
        0x323s
        0x341s
        0x364s
        0x37es
        0x379s
        0xc09s
        0xc04s
        0xc04s
        0xc07s
        0xc0es
        0xc0as
        0xc05s
        0x1c7s
        0x1ccs
        0x1dbs
        0x1ccs
        0x183s
        0x1d8s
        0x1d9s
        0x1c4s
        0x1c1s
        0x183s
        0x1e1s
        0x1c4s
        0x1des
        0x1d9s
        0x36f0s
        0x6abs
        0x685s
        0x696s
        0x689s
        0x68es
        0x36f1s
        0x6c0s
        0x21e5s
        0x6c0s
        -0x691es
        -0x6853s
        0x64f0s
        0x547fs
        0x6das
        0x6c0s
        0x62bs
        0x636s
        0x62bs
        0x7d99s
        0x64d6s
        0x4d70s
        0x7930s
        0x3700s
        0x75bs
        0x775s
        0x766s
        0x779s
        0x77es
        0x3701s
        0x730s
        0x205cs
        0x730s
        -0x68ees
        -0x69a3s
        0x5e21s
        -0x75cbs
        0x72as
        0x730s
        -0x288s
        0x51ebs
        0x5494s
        0x24es
        0x254s
        0x2b5es
        0xb5cs
        0x167s
        0x462s
        0x475s
        0x469s
        0x46cs
        0x464s
        0x445s
        0x464s
        0x469s
        0x474s
        0x465s
        0x464s
        0x442s
        0x46fs
        0x474s
        0x474s
        0x46fs
        0x46ds
        0x454s
        0x461s
        0x462s
        0x473s
        0x43as
        0x420s
        0x5a4s
        0x5a3s
        0x5b8s
        0x593s
        0x5bfs
        0x5bcs
        0x5a3s
        0x5b8s
        0x6f4s
        0x6f3s
        0x6eds
        0x6des
        0x6f1s
        0x6e0s
        0x6f5s
        0x6e9s
        0x69ds
        0x69as
        0x698s
        0x690s
        0x685s
        0x694s
        0x692s
        0x690s
        0x6aas
        0x685s
        0x694s
        0x691s
        0x6aas
        0x69ds
        0x69as
        0x681s
        0x328s
        0x324s
        0x327s
        0x304s
        0x306s
        0x30es
        0x335s
        0x317s
        0x300s
        0x316s
        0x316s
        0x97fs
        0x97cs
        0x97es
        0x976s
        0x94fs
        0x978s
        0x97bs
        0x96fs
        0x978s
        0x96es
        0x975s
        0x94es
        0x969s
        0x96fs
        0x97cs
        0x969s
        0x978s
        0x97as
        0x964s
        0x93ds
        0x96fs
        0x978s
        0x969s
        0x968s
        0x96fs
        0x973s
        0x93ds
        0x97fs
        0x978s
        0x97es
        0x97cs
        0x968s
        0x96es
        0x978s
        0x93ds
        0x974s
        0x96es
        0x95fs
        0x97cs
        0x97es
        0x976s
        0x94fs
        0x978s
        0x97bs
        0x96fs
        0x978s
        0x96es
        0x975s
        0x958s
        0x97bs
        0x97bs
        0x978s
        0x97es
        0x969s
        0x6e27s
        0x46a8s
        0x6d8as
        0x6ba4s
        0x781cs
        -0x7a05s
        0x6c68s
        0x47f9s
        0x3f4s
        0x3fbs
        0x3fes
        0x3f4s
        0x3fcs
        0x3c8s
        0x3f3s
        0x3f8s
        0x3e2s
        0x3f5s
        0x3fbs
        0x3f2s
        0x3c8s
        0x3fbs
        0x3fes
        0x3fcs
        0x3f2s
        0xb05s
        0xb09s
        0xb08s
        0xb10s
        0xb03s
        0xb14s
        0xb15s
        0xb07s
        0xb12s
        0xb0fs
        0xb09s
        0xb08s
        0xb39s
        0xb0fs
        0xb02s
        0x782s
        0x78ds
        0x788s
        0x782s
        0x78as
        0x7bes
        0x782s
        0x789s
        0x780s
        0x795s
        0x7bes
        0x784s
        0x78cs
        0x78es
        0x78bs
        0x788s
        0x736s
        0x717s
        0x71es
        0x717s
        0x706s
        0x717s
        0x716s
        0x752s
        0x713s
        0x71es
        0x71es
        0x752s
        0x733s
        0x705s
        0x717s
        0x71fs
        0x717s
        0x701s
        0x752s
        0x71ds
        0x714s
        0x752s
        0x707s
        0x71bs
        0x716s
        0x748s
        0x259s
        0x27bs
        0x266s
        0x26fs
        0x260s
        0x265s
        0x26cs
        0x24as
        0x266s
        0x27fs
        0x26cs
        0x27bs
        0x259s
        0x268s
        0x27bs
        0x268s
        0x264s
        0x27as
        0x221s
        0x27cs
        0x27as
        0x26cs
        0x27bs
        0x234s
        0xa6fs
        0xa4cs
        0xa4cs
        0xa4ds
        0xa68s
        0xa45s
        0xa45s
        0xa7as
        0xa4as
        0xa5bs
        0xa4cs
        0xa4cs
        0xa47s
        0xa61s
        0xa4cs
        0xa45s
        0xa59s
        0xa4cs
        0xa5bs
        0xa07s
        0xa5bs
        0xa4cs
        0xa5as
        0xa40s
        0xa53s
        0xa4cs
        0xa7fs
        0xa40s
        0xa4cs
        0xa5es
        0x9dfs
        0x9f4s
        0x9e6s
        0x9d3s
        0x9d6s
        0x9d2s
        0x9f4s
        0x9fds
        0x9fds
        0x9c2s
        0x9e5s
        0x9f0s
        0x9e5s
        0x9f4s
        0x9b9s
        0x9fcs
        0x9e2s
        0x9f6s
        0x9acs
        0x7b0s
        0x786s
        0x78ds
        0x787s
        0x7aes
        0x790s
        0x784s
        0x7abs
        0x782s
        0x78ds
        0x787s
        0x78fs
        0x786s
        0x791s
        0x7cds
        0x790s
        0x786s
        0x78ds
        0x787s
        0x7cbs
        0x7cas
        0x7d9s
        0x7c3s
        0x48bs
        0x4a7s
        0x4b4s
        0x4ads
        0x485s
        0x4a9s
        0x4a8s
        0x4b0s
        0x4a3s
        0x4b4s
        0x4b5s
        0x4a7s
        0x4b2s
        0x4afs
        0x4a9s
        0x4a8s
        0x494s
        0x4a3s
        0x4a7s
        0x4a2s
        0x48es
        0x4a7s
        0x4a8s
        0x4a2s
        0x4aas
        0x4a3s
        0x4b4s
        0x4e6s
        0x4a2s
        0x4a9s
        0x48bs
        0x4a7s
        0x4b4s
        0x4ads
        0x4e6s
        0x4aas
        0x4a9s
        0x4a5s
        0x4a7s
        0x4aas
        0x4fcs
        0xb91s
        0xb93s
        0xb84s
        0xb91s
        0xb80s
        0xb93s
        0xb84s
        0xbccs
        0xbb1s
        0xb8ds
        0xb80s
        0xb98s
        0xbb3s
        0xb84s
        0xb90s
        0xb94s
        0xb84s
        0xb92s
        0xb95s
        0xb75s
        0xb61s
        0xb7cs
        0xb7es
        0xb4cs
        0xb61s
        0xb7cs
        0xb7fs
        0xb76s
        0xb4cs
        0xb7fs
        0xb7as
        0xb60s
        0xb67s
        0xba4s
        0xbbds
        0x57b3s
        0x5cdds
        -0xb09s
        0x5609s
        0x5bdbs
        0x602es
        -0x6fd4s
        -0x53es
        0x85es
        0x847s
        0x5449s
        0x5f27s
        -0x8f3s
        0x5f9as
        0x5248s
        0x69bds
        -0x6641s
        -0xcafs
        0x388s
        0x3c5s
        0x3fbs
        0x3cbs
        0x3das
        0x3cds
        0x3cds
        0x3c6s
        0x3ffs
        0x3c1s
        0x3ccs
        0x3dcs
        0x3c0s
        0xba3s
        0xba6s
        0xbb1s
        0xbbfs
        0xbbas
        0xba0s
        0xbbbs
        0x789s
        0x78es
        0x78cs
        0x784s
        0x791s
        0x780s
        0x786s
        0x784s
        0x7bes
        0x792s
        0x789s
        0x78es
        0x791s
        0x791s
        0x788s
        0x78fs
        0x786s
        0x7bes
        0x782s
        0x780s
        0x793s
        0x795s
        0x67bs
        0x67bs
        0x67bs
        0x67bs
        0x5876s
        0x64fs
        0x610as
        0x666s
        0x63e7s
        0xa2es
        0xa2es
        0xa4ds
        0xa07s
        0xa07s
        0x802s
        0x802s
        0x802s
        0x802s
        0x560fs
        0x836s
        0x836s
        0x6f73s
        0x81fs
        0x81fs
        0x6d9es
        0x4f7s
        0x4fcs
        0x4f1s
        0x4fds
        0x4f6s
        0x4f7s
        0x4des
        0x4fbs
        0x4e4s
        0x4f7s
        0x4c2s
        0x4fas
        0x4fds
        0x4e6s
        0x4fds
        0x4b2s
        0x4fds
        0x4fes
        0x4f6s
        0x4b2s
        0x4e0s
        0x4f7s
        0x4e1s
        0x4e7s
        0x4fes
        0x4e6s
        0x4d1s
        0x4fds
        0x4f6s
        0x4f7s
        0x4b2s
        0x8e8s
        0x8e4s
        0x8e6s
        0x8a5s
        0x8e9s
        0x8f2s
        0x8ffs
        0x8ees
        0x8efs
        0x8eas
        0x8e5s
        0x8e8s
        0x8ees
        0x8a5s
        0x8e2s
        0x8ees
        0x8f8s
        0x8a5s
        0x8eas
        0x8e9s
        0x8e6s
        0x8e4s
        0x8e8s
        0x8e0s
        0x8a5s
        0x8eas
        0x8e5s
        0x8e5s
        0x8e4s
        0x8ffs
        0x8eas
        0x8ffs
        0x8e2s
        0x8e4s
        0x8e5s
        0x8f8s
        0x8a5s
        0x8cas
        0x8c9s
        0x8c0s
        0x8ees
        0x8f2s
        0x195s
        0x199s
        0x19bs
        0x19bs
        0x193s
        0x198s
        0x182s
        0x1a9s
        0x19ds
        0x19bs
        0x186s
        0x1a9s
        0x186s
        0x197s
        0x198s
        0x193s
        0x19as
        0x1a9s
        0x193s
        0x18es
        0x186s
        0x1a9s
        0x19ds
        0x193s
        0x18fs
        0xc4bs
        0x875s
        0x879s
        0x87bs
        0x838s
        0x865s
        0x865s
        0x838s
        0x877s
        0x878s
        0x872s
        0x864s
        0x879s
        0x87fs
        0x872s
        0x838s
        0x863s
        0x871s
        0x875s
        0x838s
        0x877s
        0x861s
        0x873s
        0x87bs
        0x873s
        0x838s
        0x870s
        0x87as
        0x863s
        0x86es
        0x838s
        0x864s
        0x873s
        0x871s
        0x87fs
        0x865s
        0x862s
        0x873s
        0x864s
        0x838s
        0x874s
        0x879s
        0x862s
        0x862s
        0x879s
        0x87bs
        0x838s
        0x874s
        0x877s
        0x864s
        0x838s
        0x850s
        0x873s
        0x873s
        0x872s
        0x854s
        0x879s
        0x862s
        0x862s
        0x879s
        0x87bs
        0x854s
        0x877s
        0x864s
        0x855s
        0x879s
        0x878s
        0x862s
        0x877s
        0x87fs
        0x878s
        0x873s
        0x864s
        0x855s
        0x879s
        0x87bs
        0x866s
        0x879s
        0x878s
        0x873s
        0x878s
        0x862s
        0x844s
        0x873s
        0x871s
        0x87fs
        0x865s
        0x862s
        0x873s
        0x864s
        0xb0es
        0xb22s
        0xb23s
        0xb39s
        0xb28s
        0xb35s
        0xb39s
        0x22fs
        0x210s
        0x21cs
        0x20es
        0x23es
        0x20bs
        0x216s
        0x20cs
        0x209s
        0xa42s
        0xa7ds
        0xa71s
        0xa63s
        0xc7ds
        0xc7cs
        0xc7cs
        0xc7cs
        0xc7cs
        0xc62s
        0xc7cs
        0xbb1s
        0xbaes
        0xbb0s
        0x453fs
        0x680s
        0x4467s
        0x21ds
        0x242s
        0x24ds
        0x248s
        0x24fs
        0x248s
        0x255s
        0x21fs
        0x310s
        0x33es
        0x337s
        0x33cs
        0x35fs
        0x310s
        0x311s
        0x32ds
        0x31as
        0x31cs
        0x310s
        0x30ds
        0x31bs
        0x33cs
        0x310s
        0x312s
        0x30fs
        0x313s
        0x31as
        0x30bs
        0x31as
        0x353s
        0x35fs
        0x31as
        0x307s
        0x316s
        0x30cs
        0x30bs
        0x30cs
        0x345s
        0x35fs
        0xb18s
        0xb17s
        0xb12s
        0xb18s
        0xb10s
        0xb24s
        0xb18s
        0xb13s
        0xb1as
        0xb0fs
        0xb24s
        0xb1as
        0xb0es
        0xb1fs
        0xb12s
        0xb14s
        0xb24s
        0xb19s
        0xb1as
        0xb09s
        0x9b4s
        0x9a1s
        0x9b6s
        0x9a0s
        0x987s
        0x9bcs
        0x9b9s
        0x9acs
        0x9b9s
        0x24ds
        0x261s
        0x263s
        0x263s
        0x26bs
        0x260s
        0x27as
        0x248s
        0x26bs
        0x26bs
        0x26as
        0x234s
        0x22es
        0x26as
        0x26fs
        0x27as
        0x26fs
        0x22es
        0x27ds
        0x267s
        0x274s
        0x26bs
        0x233s
        0x538s
        0x52ds
        0x53as
        0x52cs
        0x50bs
        0x527s
        0x537s
        0x53cs
        0x531s
        0x539s
        0x535s
        0x742s
        0x76cs
        0x765s
        0x76es
        0x70ds
        0x742s
        0x743s
        0x77fs
        0x748s
        0x74es
        0x742s
        0x75fs
        0x749s
        0x76es
        0x742s
        0x740s
        0x75ds
        0x741s
        0x748s
        0x759s
        0x748s
        0x701s
        0x70ds
        0x748s
        0x755s
        0x744s
        0x75es
        0x759s
        0x75es
        0x717s
        0x70ds
        0x7acs
        0x7a3s
        0x7a6s
        0x7acs
        0x7a4s
        0x790s
        0x7acs
        0x7a7s
        0x7aes
        0x7bbs
        0x790s
        0x7aes
        0x7bas
        0x7abs
        0x7a6s
        0x7a0s
        0x790s
        0x7ads
        0x7aes
        0x7bds
        0x932s
        0x925s
        0x923s
        0x92fs
        0x932s
        0x924s
        0x93fs
        0x929s
        0x92es
        0x929s
        0x934s
        0x93fs
        0x925s
        0x932s
        0x932s
        0x92fs
        0x932s
        0x4cbs
        0x4dcs
        0x4das
        0x4d6s
        0x4cbs
        0x4dds
        0x4c6s
        0x4das
        0x4d6s
        0x4d4s
        0x4c9s
        0x4d5s
        0x4dcs
        0x4cds
        0x4dcs
        0xcf5s
        0xcfes
        0xce4s
        0xcf5s
        0xce2s
        0xccfs
        0xcf1s
        0xce5s
        0xce4s
        0xcffs
        0xccfs
        0xce3s
        0xcfbs
        0xcf9s
        0xce0s
        0xccfs
        0xcfds
        0xcf1s
        0xce2s
        0xcfbs
        0xcf5s
        0xce4s
        0xcf9s
        0xcfes
        0xcf7s
        0xccfs
        0xcf3s
        0xcf8s
        0xcf1s
        0xce0s
        0xce4s
        0xcf5s
        0xce2s
        0xab8s
        0xaa3s
        0xaa4s
        0xabcs
        0xa9ds
        0xaa2s
        0xaaes
        0xabcs
        0xae3s
        0xae2s
        0xaebs
        0xaa8s
        0xaaas
        0xaa8s
        0xaa3s
        0xaaes
        0xaebs
        0xaa3s
        0xaa2s
        0xabfs
        0xaf1s
        0xaebs
        0xaa0s
        0xaaes
        0xab2s
        0xa88s
        0xaa7s
        0xaaas
        0xab8s
        0xab8s
        0xaebs
        0xaf6s
        0xaebs
        0xcf8s
        0xcf9s
        0xcc8s
        0xce1s
        0xcfes
        0xcf2s
        0xce0s
        0xcc8s
        0xcf4s
        0xce5s
        0xcf2s
        0xcf6s
        0xce3s
        0xcf2s
        0x9ffs
        0x9d3s
        0x9d1s
        0x9d1s
        0x9d9s
        0x9d2s
        0x9c8s
        0x9f0s
        0x9d5s
        0x9cfs
        0x9c8s
        0x9fas
        0x9ces
        0x9dds
        0x9dbs
        0x9d1s
        0x9d9s
        0x9d2s
        0x9c8s
        0x986s
        0x99cs
        0x9d5s
        0x9d2s
        0x9d5s
        0x9c8s
        0x9f0s
        0x9d3s
        0x9dbs
        0x9d5s
        0x9d2s
        0x9f0s
        0x9d5s
        0x9cfs
        0x9c8s
        0x9d9s
        0x9d2s
        0x9d9s
        0x9ces
        0x345s
        0x349s
        0x34bs
        0x308s
        0x355s
        0x355s
        0x308s
        0x347s
        0x348s
        0x342s
        0x354s
        0x349s
        0x34fs
        0x342s
        0x308s
        0x353s
        0x341s
        0x345s
        0x308s
        0x347s
        0x351s
        0x343s
        0x34bs
        0x343s
        0x308s
        0x347s
        0x354s
        0x345s
        0x34es
        0x308s
        0x353s
        0x34fs
        0x314s
        0x308s
        0x362s
        0x34fs
        0x355s
        0x347s
        0x344s
        0x34as
        0x343s
        0x374s
        0x343s
        0x348s
        0x342s
        0x343s
        0x354s
        0x375s
        0x352s
        0x347s
        0x352s
        0x343s
        0x373s
        0x36fs
        0x36bs
        0x349s
        0x342s
        0x353s
        0x34as
        0x343s
        0x9c4s
        0x9cbs
        0x9c1s
        0x9d7s
        0x9cas
        0x9ccs
        0x9c1s
        0x98bs
        0x9d3s
        0x9ccs
        0x9c0s
        0x9d2s
        0x98bs
        0x9f3s
        0x9ccs
        0x9c0s
        0x9d2s
        0x23fs
        0x226s
        0x220s
        0x22ds
        0x240s
        0x24cs
        0x24es
        0x20ds
        0x250s
        0x250s
        0x20ds
        0x242s
        0x24ds
        0x247s
        0x251s
        0x24cs
        0x24as
        0x247s
        0x20ds
        0x256s
        0x244s
        0x240s
        0x20ds
        0x242s
        0x254s
        0x246s
        0x24es
        0x246s
        0x20ds
        0x24as
        0x24es
        0x20ds
        0x241s
        0x256s
        0x250s
        0x24as
        0x24ds
        0x246s
        0x250s
        0x250s
        0x20ds
        0x240s
        0x24bs
        0x242s
        0x257s
        0x20ds
        0x24es
        0x250s
        0x244s
        0x240s
        0x246s
        0x24fs
        0x24fs
        0x20ds
        0x240s
        0x24cs
        0x24es
        0x24es
        0x24cs
        0x24ds
        0x20ds
        0x241s
        0x244s
        0x20ds
        0x26ds
        0x246s
        0x254s
        0x261s
        0x244s
        0x260s
        0x24cs
        0x24ds
        0x257s
        0x246s
        0x24ds
        0x257s
        0x260s
        0x246s
        0x24fs
        0x24fs
        0x276s
        0x26as
        0x97as
        0x963s
        0x965s
        0x968s
        0xa83s
        0xa9fs
        0xa85s
        0xa98s
        0xa80s
        0xaa2s
        0xa99s
        0xa9es
        0xa99s
        0xa9es
        0xa83s
        0xa9es
        0xa96s
        0xa9bs
        0xa9es
        0xa8ds
        0xa92s
        0xa93s
        0xaa7s
        0xa85s
        0xa98s
        0xa87s
        0xa92s
        0xa85s
        0xa83s
        0xa8es
        0xab6s
        0xa94s
        0xa94s
        0xa92s
        0xa84s
        0xa84s
        0xab2s
        0xa8fs
        0xa94s
        0xa92s
        0xa87s
        0xa83s
        0xa9es
        0xa98s
        0xa99s
        0x55cs
        0x550s
        0x552s
        0x511s
        0x54cs
        0x54cs
        0x511s
        0x55es
        0x551s
        0x55bs
        0x54ds
        0x550s
        0x556s
        0x55bs
        0x511s
        0x54as
        0x558s
        0x55cs
        0x511s
        0x55es
        0x548s
        0x55as
        0x552s
        0x55as
        0x511s
        0x559s
        0x553s
        0x54as
        0x547s
        0x511s
        0x55cs
        0x550s
        0x552s
        0x54fs
        0x550s
        0x551s
        0x55as
        0x551s
        0x54bs
        0x511s
        0x576s
        0x579s
        0x553s
        0x54as
        0x547s
        0x57cs
        0x550s
        0x552s
        0x54fs
        0x550s
        0x551s
        0x55as
        0x551s
        0x54bs
        0x56ds
        0x55as
        0x558s
        0x556s
        0x54cs
        0x54bs
        0x55as
        0x54ds
        0x79es
        0x791s
        0x79bs
        0x78ds
        0x790s
        0x796s
        0x79bs
        0x7d1s
        0x789s
        0x796s
        0x79as
        0x788s
        0x7d1s
        0x7a9s
        0x796s
        0x79as
        0x788s
        0x7b8s
        0x78ds
        0x790s
        0x78as
        0x78fs
        0x6e1s
        0x6eds
        0x6efs
        0x6acs
        0x6f1s
        0x6f1s
        0x6acs
        0x6e3s
        0x6ecs
        0x6e6s
        0x6f0s
        0x6eds
        0x6ebs
        0x6e6s
        0x6acs
        0x6f7s
        0x6e5s
        0x6e1s
        0x6acs
        0x6e3s
        0x6f5s
        0x6e7s
        0x6efs
        0x6e7s
        0x6acs
        0x6e4s
        0x6e7s
        0x6e7s
        0x6e6s
        0x6acs
        0x6efs
        0x6eds
        0x6e6s
        0x6e7s
        0x6ees
        0x6acs
        0x6d4s
        0x6ebs
        0x6e6s
        0x6e7s
        0x6eds
        0x68bs
        0x68ds
        0x69bs
        0x69bs
        0x69ds
        0x68bs
        0x68bs
        0x568s
        0x55es
        0x549s
        0x552s
        0x55as
        0x557s
        0x552s
        0x541s
        0x55es
        0x55fs
        0x575s
        0x55as
        0x556s
        0x55es
        0x52ds
        0x531s
        0x53cs
        0x524s
        0x502s
        0x53cs
        0x539s
        0x539s
        0x52fs
        0xc31s
        0xc35s
        0xc36s
        0x9d5s
        0x98fs
        0x98bs
        0x989s
        0x5cbs
        0x5d0s
        0x5dds
        0x5ccs
        0x5dfs
        0x5cas
        0x598s
        0x249s
        0x24as
        0x252s
        0x247s
        0x257s
        0x433s
        0x42cs
        0x421s
        0x420s
        0x42as
        0x43as
        0x435s
        0x429s
        0x424s
        0x43cs
        0x43as
        0x424s
        0x421s
        0x421s
        0x437s
        0x43as
        0x423s
        0x42cs
        0x420s
        0x429s
        0x421s
        0x282s
        0x29es
        0x293s
        0x28bs
        0x2ads
        0x293s
        0x296s
        0x296s
        0x280s
        0x2ads
        0x2c0s
        0x2c4s
        0x2c7s
        0xbbfs
        0xba0s
        0xbads
        0xbacs
        0xba6s
        0xbb6s
        0xbb9s
        0xba5s
        0xba8s
        0xbb0s
        0xbb6s
        0xba8s
        0xbads
        0xbads
        0xbbbs
        0xbb6s
        0xbdbs
        0xbdfs
        0xbdcs
        0xbb6s
        0xbafs
        0xba0s
        0xbacs
        0xba5s
        0xbads
        0x2dcs
        0x2c0s
        0x2cds
        0x2d5s
        0x2f3s
        0x2cds
        0x2c8s
        0x2c8s
        0x2des
        0x2f3s
        0x2c4s
        0x29es
        0x29as
        0x298s
        0x49bs
        0x484s
        0x489s
        0x488s
        0x482s
        0x492s
        0x49ds
        0x481s
        0x48cs
        0x494s
        0x492s
        0x48cs
        0x489s
        0x489s
        0x49fs
        0x492s
        0x485s
        0x4ffs
        0x4fbs
        0x4f9s
        0x492s
        0x48bs
        0x484s
        0x488s
        0x481s
        0x489s
        0x491s
        0x48ds
        0x480s
        0x498s
        0x4bes
        0x480s
        0x485s
        0x485s
        0x493s
        0x4bes
        0x483s
        0x498s
        0x495s
        0x484s
        0x497s
        0x482s
        0x4d0s
        0x808s
        0x817s
        0x81as
        0x81bs
        0x811s
        0x801s
        0x80es
        0x812s
        0x81fs
        0x807s
        0x801s
        0x81fs
        0x81as
        0x81as
        0x80cs
        0x801s
        0x81cs
        0x807s
        0x80as
        0x81bs
        0x808s
        0x81ds
        0x86fs
        0x801s
        0x818s
        0x817s
        0x81bs
        0x812s
        0x81as
        0x612s
        0x61es
        0x61cs
        0x65fs
        0x602s
        0x602s
        0x65fs
        0x610s
        0x61fs
        0x615s
        0x603s
        0x61es
        0x618s
        0x615s
        0x65fs
        0x604s
        0x616s
        0x612s
        0x65fs
        0x610s
        0x606s
        0x614s
        0x61cs
        0x614s
        0x65fs
        0x617s
        0x614s
        0x614s
        0x615s
        0x65fs
        0x61cs
        0x61es
        0x615s
        0x614s
        0x61ds
        0x65fs
        0x627s
        0x618s
        0x615s
        0x614s
        0x61es
        0x20es
        0x202s
        0x200s
        0x243s
        0x20as
        0x202s
        0x202s
        0x20as
        0x201s
        0x208s
        0x243s
        0x20as
        0x21es
        0x202s
        0x203s
        0x243s
        0x20cs
        0x203s
        0x203s
        0x202s
        0x219s
        0x20cs
        0x219s
        0x204s
        0x202s
        0x203s
        0x21es
        0x243s
        0x23es
        0x208s
        0x21fs
        0x204s
        0x20cs
        0x201s
        0x204s
        0x217s
        0x208s
        0x209s
        0x223s
        0x20cs
        0x200s
        0x208s
        0x739s
        0x728s
        0x72fs
        0x73cs
        0x729s
        0x734s
        0x732s
        0x733s
        0x31bs
        0x310s
        0x30as
        0x31bs
        0x30cs
        0x321s
        0x313s
        0x31bs
        0x30as
        0x316s
        0x311s
        0x31as
        0x386s
        0x38fs
        0x392s
        0x38ds
        0x381s
        0x394s
        0x3bfs
        0x381s
        0x383s
        0x394s
        0x389s
        0x38fs
        0x38es
        0x3bfs
        0x382s
        0x381s
        0x392s
        0x3bfs
        0x393s
        0x388s
        0x38fs
        0x397s
        0xbb8s
        0xbb4s
        0xbb6s
        0xbb9s
        0xbb2s
        0xbb5s
        0xbbes
        0xb95s
        0xbbes
        0xbacs
        0xb9fs
        0xbbas
        0xbafs
        0xbbas
        0xb97s
        0xbb2s
        0xba8s
        0xbafs
        0xb84s
        0xbb7s
        0xbb4s
        0xbbcs
        0x6d2s
        0x6e5s
        0x6ecs
        0x6e1s
        0x6f4s
        0x6e9s
        0x6efs
        0x6ees
        0x6d5s
        0x6f3s
        0x6e5s
        0x6f2s
        0x6bas
        0x6a5s
        0x6f3s
        0x6acs
        0x6a5s
        0x6f3s
        0x6acs
        0x6a5s
        0x6f3s
        0x6acs
        0x6a5s
        0x6f3s
        0xb00s
        0xb36s
        0xb32s
        0xb21s
        0xb30s
        0xb3bs
        0xb10s
        0xb36s
        0xb3fs
        0xb3fs
        0xb17s
        0xb32s
        0xb27s
        0xb32s
        0xb7bs
        0xb30s
        0xb36s
        0xb3fs
        0xb3fs
        0xb07s
        0xb2as
        0xb23s
        0xb36s
        0xb6es
        0x4c2s
        0x4ees
        0x4efs
        0x4f7s
        0x4e4s
        0x4f3s
        0x4f2s
        0x4e0s
        0x4f5s
        0x4e8s
        0x4ees
        0x4efs
        0x4d3s
        0x4e4s
        0x4f2s
        0x4f4s
        0x4eds
        0x4f5s
        0x4a9s
        0x4e2s
        0x4ees
        0x4efs
        0x4f7s
        0x4e4s
        0x4f3s
        0x4f2s
        0x4e0s
        0x4f5s
        0x4e8s
        0x4ees
        0x4efs
        0x4c8s
        0x4e5s
        0x4bcs
        0xae0s
        0xaccs
        0xacds
        0xad7s
        0xac2s
        0xac0s
        0xad7s
        0xaf1s
        0xac6s
        0xad0s
        0xad6s
        0xacfs
        0xad7s
        0xa8bs
        0xad6s
        0xacas
        0xac7s
        0xa9es
        0x2a6s
        0x2aas
        0x2a8s
        0x2ebs
        0x2b6s
        0x2b6s
        0x2ebs
        0x2a4s
        0x2abs
        0x2a1s
        0x2b7s
        0x2aas
        0x2acs
        0x2a1s
        0x2ebs
        0x2b0s
        0x2a2s
        0x2a6s
        0x2ebs
        0x2a4s
        0x2b2s
        0x2a0s
        0x2a8s
        0x2a0s
        0x2ebs
        0x2acs
        0x2a8s
        0x2ebs
        0x2b6s
        0x2ads
        0x2a4s
        0x2b7s
        0x2a0s
        0x2ebs
        0x2b6s
        0x2ads
        0x2a4s
        0x2b7s
        0x2a0s
        0x2a9s
        0x2acs
        0x2b6s
        0x2b1s
        0x2ebs
        0x28cs
        0x288s
        0x296s
        0x2ads
        0x2a4s
        0x2b7s
        0x2a0s
        0x286s
        0x2aas
        0x2abs
        0x2b1s
        0x2a4s
        0x2a6s
        0x2b1s
        0x2b6s
        0x289s
        0x2acs
        0x2b6s
        0x2b1s
        0x284s
        0x2a1s
        0x2a4s
        0x2b5s
        0x2b1s
        0x2a0s
        0x2b7s
        0x854s
        0x842s
        0x853s
        0x863s
        0x846s
        0x853s
        0x846s
        0x81ds
        0x807s
        0x4a8s
        0x4a4s
        0x4a6s
        0x4e5s
        0x4b8s
        0x4b8s
        0x4e5s
        0x4aas
        0x4a5s
        0x4afs
        0x4b9s
        0x4a4s
        0x4a2s
        0x4afs
        0x4e5s
        0x4bes
        0x4acs
        0x4a8s
        0x4e5s
        0x4aas
        0x4bcs
        0x4aes
        0x4a6s
        0x4aes
        0x4e5s
        0x4a2s
        0x4a6s
        0x4e5s
        0x4b8s
        0x4afs
        0x4a0s
        0x4e5s
        0x4a6s
        0x4a4s
        0x4afs
        0x4bes
        0x4a7s
        0x4aes
        0x4e5s
        0x4b8s
        0x4aes
        0x4b8s
        0x4b8s
        0x4a2s
        0x4a4s
        0x4a5s
        0x4e5s
        0x4b9s
        0x4a2s
        0x4bbs
        0x4b8s
        0x4e5s
        0x4a7s
        0x4a2s
        0x4b8s
        0x4bfs
        0x4e5s
        0x4bds
        0x4a3s
        0x4e5s
        0x489s
        0x4aas
        0x4b8s
        0x4aes
        0x498s
        0x4aes
        0x4b8s
        0x4b8s
        0x4a2s
        0x4a4s
        0x4a5s
        0x49ds
        0x4a2s
        0x4aes
        0x4bcs
        0x483s
        0x4a4s
        0x4a7s
        0x4afs
        0x4aes
        0x4b9s
        0xa85s
        0xaa9s
        0xaabs
        0xaabs
        0xaa9s
        0xaa8s
        0xa95s
        0xaa3s
        0xab5s
        0xab5s
        0xaafs
        0xaa9s
        0xaa8s
        0xa8fs
        0xab2s
        0xaa3s
        0xaabs
        0xa95s
        0xab2s
        0xaa7s
        0xab2s
        0xaa3s
        0x625s
        0x63cs
        0x63as
        0x637s
        0x9c8s
        0x9c4s
        0x9c6s
        0x985s
        0x9d8s
        0x9d8s
        0x985s
        0x9cas
        0x9c5s
        0x9cfs
        0x9d9s
        0x9c4s
        0x9c2s
        0x9cfs
        0x985s
        0x9des
        0x9ccs
        0x9c8s
        0x985s
        0x9cas
        0x9dcs
        0x9ces
        0x9c6s
        0x9ces
        0x985s
        0x9c8s
        0x9c4s
        0x9c6s
        0x9c6s
        0x9c4s
        0x9c5s
        0x985s
        0x9cas
        0x9cfs
        0x9cas
        0x9dbs
        0x9dfs
        0x9ces
        0x9d9s
        0x985s
        0x9e9s
        0x9cas
        0x9d8s
        0x9ces
        0x9eas
        0x9cfs
        0x9cas
        0x9dbs
        0x9dfs
        0x9ces
        0x9d9s
        0x76as
        0x76ds
        0x775s
        0x76cs
        0x768s
        0x766s
        0x72es
        0x775s
        0x76as
        0x771s
        0x777s
        0x776s
        0x762s
        0x76fs
        0x2b9s
        0x2aes
        0x2bfs
        0x2bes
        0x2b9s
        0x2a5s
        0x2e6s
        0x2bds
        0x2a4s
        0x2a2s
        0x2afs
        0x9a3s
        0x9bas
        0x9bfs
        0x9bes
        0x9e7s
        0x9a5s
        0x9a8s
        0x9a0s
        0x9afs
        0x9a9s
        0x9bes
        0xb6fs
        0xb64s
        0xb73s
        0xb64s
        0xb2bs
        0xb70s
        0xb71s
        0xb6cs
        0xb69s
        0xb2bs
        0xb49s
        0xb6cs
        0xb76s
        0xb71s
        0x4fas
        0x4e3s
        0x4e5s
        0x4e8s
        0xb3es
        0xb3fs
        0xb24s
        0xb39s
        0xb36s
        0xb29s
        0xb14s
        0xb31s
        0xb24s
        0xb31s
        0xb03s
        0xb35s
        0xb24s
        0xb13s
        0xb38s
        0xb31s
        0xb3es
        0xb37s
        0xb35s
        0xb34s
        0xbf9s
        0xbees
        0xbf9s
        0xbecs
        0xbf9s
        0xbeas
        0xbccs
        0xbf0s
        0xbeds
        0xbf5s
        0xbfas
        0xbcbs
        0xbecs
        0xbeas
        0x5f2s
        0x5f9s
        0x5ees
        0x5f9s
        0x5b6s
        0x5f4s
        0x5f9s
        0x5f6s
        0x5ffs
        0x5b6s
        0x5cbs
        0x5ecs
        0x5eas
        0x5f1s
        0x5f6s
        0x5ffs
        0x34cs
        0x340s
        0x342s
        0x301s
        0x348s
        0x340s
        0x340s
        0x348s
        0x343s
        0x34as
        0x301s
        0x348s
        0x35cs
        0x340s
        0x341s
        0x301s
        0x34es
        0x341s
        0x341s
        0x340s
        0x35bs
        0x34es
        0x35bs
        0x346s
        0x340s
        0x341s
        0x35cs
        0x301s
        0x37cs
        0x34as
        0x35ds
        0x346s
        0x34es
        0x343s
        0x346s
        0x355s
        0x34as
        0x34bs
        0x361s
        0x34es
        0x342s
        0x34as
        0x993s
        0x985s
        0x983s
        0x9bfs
        0x995s
        0x989s
        0x984s
        0x905s
        0x909s
        0x90bs
        0x948s
        0x901s
        0x909s
        0x909s
        0x901s
        0x90as
        0x903s
        0x948s
        0x901s
        0x915s
        0x909s
        0x908s
        0x948s
        0x907s
        0x908s
        0x908s
        0x909s
        0x912s
        0x907s
        0x912s
        0x90fs
        0x909s
        0x908s
        0x915s
        0x948s
        0x935s
        0x903s
        0x914s
        0x90fs
        0x907s
        0x90as
        0x90fs
        0x91cs
        0x903s
        0x902s
        0x928s
        0x907s
        0x90bs
        0x903s
        0x630s
        0x636s
        0x620s
        0x637s
        0x61as
        0x62cs
        0x62bs
        0x623s
        0x62as
        0x862s
        0x87ds
        0x861s
        0x87bs
        0x866s
        0x87bs
        0x87ds
        0x87cs
        0x20ds
        0x221s
        0x232s
        0x22bs
        0x203s
        0x22fs
        0x22es
        0x236s
        0x225s
        0x232s
        0x233s
        0x221s
        0x234s
        0x229s
        0x22fs
        0x22es
        0x212s
        0x225s
        0x221s
        0x224s
        0x208s
        0x221s
        0x22es
        0x224s
        0x22cs
        0x225s
        0x232s
        0x260s
        0x224s
        0x22fs
        0x20ds
        0x221s
        0x232s
        0x22bs
        0x260s
        0x22cs
        0x22fs
        0x223s
        0x221s
        0x22cs
        0x27as
        0xccfs
        0xcc3s
        0xcc1s
        0xc82s
        0xcdfs
        0xcdfs
        0xc82s
        0xccds
        0xcc2s
        0xcc8s
        0xcdes
        0xcc3s
        0xcc5s
        0xcc8s
        0xc82s
        0xcd9s
        0xccbs
        0xccfs
        0xc82s
        0xccds
        0xcdbs
        0xcc9s
        0xcc1s
        0xcc9s
        0xc82s
        0xcdcs
        0xcdes
        0xcc3s
        0xccas
        0xcc5s
        0xcc0s
        0xcc9s
        0xc82s
        0xcc1s
        0xcc3s
        0xcc8s
        0xcc9s
        0xcc0s
        0xc82s
        0xcf9s
        0xcdfs
        0xcc9s
        0xcdes
        0x33es
        0x332s
        0x330s
        0x373s
        0x33as
        0x332s
        0x332s
        0x33as
        0x331s
        0x338s
        0x373s
        0x33as
        0x32es
        0x332s
        0x333s
        0x373s
        0x33cs
        0x333s
        0x333s
        0x332s
        0x329s
        0x33cs
        0x329s
        0x334s
        0x332s
        0x333s
        0x32es
        0x373s
        0x30es
        0x338s
        0x32fs
        0x334s
        0x33cs
        0x331s
        0x334s
        0x327s
        0x338s
        0x339s
        0x313s
        0x33cs
        0x330s
        0x338s
        0x29as
        0x29cs
        0x28as
        0x29ds
        0x2b0s
        0x286s
        0x281s
        0x289s
        0x280s
        0x395s
        0x399s
        0x39bs
        0x386s
        0x397s
        0x384s
        0x393s
        0x3a2s
        0x399s
        0x31as
        0x315s
        0x316s
        0x317s
        0x31cs
        0x64fs
        0x644s
        0x653s
        0x644s
        0x60bs
        0x649s
        0x644s
        0x64bs
        0x642s
        0x60bs
        0x66as
        0x647s
        0x64fs
        0x640s
        0x646s
        0x651s
        0x6f2s
        0x6f9s
        0x6ees
        0x6f9s
        0x6b6s
        0x6f4s
        0x6f9s
        0x6f6s
        0x6ffs
        0x6b6s
        0x6dbs
        0x6f7s
        0x6f5s
        0x6e8s
        0x6f9s
        0x6eas
        0x6f9s
        0x6fas
        0x6f4s
        0x6fds
        0xb22s
        0xb2es
        0xb2cs
        0xb6fs
        0xb32s
        0xb32s
        0xb6fs
        0xb20s
        0xb2fs
        0xb25s
        0xb33s
        0xb2es
        0xb28s
        0xb25s
        0xb6fs
        0xb34s
        0xb26s
        0xb22s
        0xb6fs
        0xb20s
        0xb36s
        0xb24s
        0xb2cs
        0xb24s
        0xb6fs
        0xb28s
        0xb2cs
        0xb6fs
        0xb23s
        0xb34s
        0xb32s
        0xb28s
        0xb2fs
        0xb24s
        0xb32s
        0xb32s
        0xb6fs
        0xb22s
        0xb29s
        0xb20s
        0xb35s
        0xb6fs
        0xb2cs
        0xb32s
        0xb26s
        0xb22s
        0xb24s
        0xb2ds
        0xb2ds
        0xb6fs
        0xb22s
        0xb2es
        0xb2cs
        0xb2cs
        0xb2es
        0xb2fs
        0xb6fs
        0xb23s
        0xb20s
        0xb32s
        0xb28s
        0xb22s
        0xb6fs
        0xb16s
        0xb20s
        0xb2ds
        0xb2ds
        0xb31s
        0xb20s
        0xb31s
        0xb24s
        0xb33s
        0xb0cs
        0xb20s
        0xb32s
        0xb2as
        0xb02s
        0xb24s
        0xb2ds
        0xb2ds
        0xb14s
        0xb08s
        0xcc7s
        0xccbs
        0xcc9s
        0xc8as
        0xcd7s
        0xcd7s
        0xc8as
        0xcc5s
        0xccas
        0xcc0s
        0xcd6s
        0xccbs
        0xccds
        0xcc0s
        0xc8as
        0xcd1s
        0xcc3s
        0xcc7s
        0xc8as
        0xcc5s
        0xcd3s
        0xcc1s
        0xcc9s
        0xcc1s
        0xc8as
        0xccds
        0xcc9s
        0xc8as
        0xcc6s
        0xcd1s
        0xcd7s
        0xccds
        0xccas
        0xcc1s
        0xcd7s
        0xcd7s
        0xc8as
        0xcc7s
        0xcccs
        0xcc5s
        0xcd0s
        0xc8as
        0xcc9s
        0xcd7s
        0xcc3s
        0xcc7s
        0xcc1s
        0xcc8s
        0xcc8s
        0xc8as
        0xcc7s
        0xccbs
        0xcc9s
        0xcc9s
        0xccbs
        0xccas
        0xc8as
        0xcc6s
        0xcc5s
        0xcd7s
        0xccds
        0xcc7s
        0xc8as
        0xce9s
        0xcd1s
        0xcc8s
        0xcd0s
        0xccds
        0xce0s
        0xcdds
        0xccas
        0xcc5s
        0xcc9s
        0xccds
        0xcc7s
        0xceds
        0xcc7s
        0xccbs
        0xccas
        0xce7s
        0xcc1s
        0xcc8s
        0xcc8s
        0xcf1s
        0xceds
        0x387s
        0x38bs
        0x389s
        0x3cas
        0x397s
        0x397s
        0x3cas
        0x385s
        0x38as
        0x380s
        0x396s
        0x38bs
        0x38ds
        0x380s
        0x3cas
        0x391s
        0x383s
        0x387s
        0x3cas
        0x385s
        0x393s
        0x381s
        0x389s
        0x381s
        0x3cas
        0x382s
        0x381s
        0x381s
        0x380s
        0x3cas
        0x389s
        0x38bs
        0x380s
        0x381s
        0x388s
        0x3cas
        0x3a2s
        0x381s
        0x381s
        0x380s
        0x3ads
        0x390s
        0x381s
        0x389s
        0x3a8s
        0x38ds
        0x397s
        0x390s
        0x4cds
        0x4c8s
        0x4cds
        0x4dcs
        0x4d8s
        0x4c9s
        0x4des
        0x36fs
        0xba2s
        0x614s
        0x409s
        0x40es
        0x41cs
        0x41bs
        0x422s
        0x40as
        0x40bs
        0x406s
        0x40es
        0x43cs
        0x41bs
        0x40es
        0x41bs
        0x40as
        0x62es
        0x634s
        0x614s
        0x622s
        0x62bs
        0x622s
        0x624s
        0x633s
        0x622s
        0x623s
        0xc5as
        0xc57s
        0xc57s
        0xc54s
        0xc5ds
        0xc59s
        0xc56s
        0x7bds
        0x7b1s
        0x7b3s
        0x7f0s
        0x7bcs
        0x7a7s
        0x7aas
        0x7bbs
        0x7bas
        0x7bfs
        0x7b0s
        0x7bds
        0x7bbs
        0x7f0s
        0x7b7s
        0x7b3s
        0x7f0s
        0x7bds
        0x7b1s
        0x7acs
        0x7bbs
        0x7f0s
        0x7b3s
        0x7b1s
        0x7bas
        0x7bbs
        0x7b2s
        0x7f0s
        0x793s
        0x7bbs
        0x7ads
        0x7ads
        0x7bfs
        0x7b9s
        0x7bbs
        0x4d4s
        0x4dfs
        0x4c8s
        0x4dfs
        0x490s
        0x4cbs
        0x4cas
        0x4d7s
        0x4d2s
        0x490s
        0x4f3s
        0x4dfs
        0x4ces
        0xc42s
        0xc5bs
        0xc5ds
        0xc50s
        0xb6es
        0xb65s
        0xb72s
        0xb65s
        0xb2as
        0xb71s
        0xb70s
        0xb6ds
        0xb68s
        0xb2as
        0xb4cs
        0xb65s
        0xb77s
        0xb6cs
        0xb49s
        0xb65s
        0xb74s
        0x75es
        0x70bs
        0x70cs
        0x70bs
        0x716s
        0x75cs
        0xc10s
        0xc1cs
        0xc1es
        0xc5ds
        0xc00s
        0xc00s
        0xc5ds
        0xc12s
        0xc1ds
        0xc17s
        0xc01s
        0xc1cs
        0xc1as
        0xc17s
        0xc5ds
        0xc06s
        0xc14s
        0xc10s
        0xc5ds
        0xc12s
        0xc04s
        0xc16s
        0xc1es
        0xc16s
        0xc5ds
        0xc1as
        0xc1es
        0xc5ds
        0xc00s
        0xc17s
        0xc18s
        0xc5ds
        0xc10s
        0xc1bs
        0xc12s
        0xc07s
        0xc5ds
        0xc1es
        0xc1cs
        0xc17s
        0xc16s
        0xc1fs
        0xc5ds
        0xc31s
        0xc12s
        0xc00s
        0xc16s
        0xc30s
        0xc1cs
        0xc1ds
        0xc07s
        0xc16s
        0xc1ds
        0xc07s
        0x8bbs
        0x8b7s
        0x8b5s
        0x8f6s
        0x8abs
        0x8abs
        0x8f6s
        0x8b9s
        0x8b6s
        0x8bcs
        0x8aas
        0x8b7s
        0x8b1s
        0x8bcs
        0x8f6s
        0x8ads
        0x8bfs
        0x8bbs
        0x8f6s
        0x8b9s
        0x8afs
        0x8bds
        0x8b5s
        0x8bds
        0x8f6s
        0x8abs
        0x8b0s
        0x8b9s
        0x8aas
        0x8bds
        0x8aas
        0x8f6s
        0x8ads
        0x8b1s
        0x8f6s
        0x88bs
        0x8b0s
        0x8b9s
        0x8aas
        0x8bds
        0x888s
        0x8b9s
        0x8bbs
        0x8b3s
        0x8b9s
        0x8bfs
        0x8bds
        0x5c2s
        0x5d3s
        0x5d3s
        0x5c6s
        0x5cds
        0x5c7s
        0x583s
        0x5cds
        0x5ccs
        0x5d7s
        0x583s
        0x5d5s
        0x5c2s
        0x5cfs
        0x5cas
        0x5c7s
        0x5f9s
        0x5ffs
        0x5bes
        0x5e2s
        0x5f5s
        0x5f1s
        0x5f3s
        0x5e4s
        0x5f9s
        0x5e6s
        0x5f5s
        0x5e8s
        0x5bes
        0x5dfs
        0x5f2s
        0x5e3s
        0x5f5s
        0x5e2s
        0x5e6s
        0x5f1s
        0x5f2s
        0x5fcs
        0x5f5s
        0x2e8s
        0x2e5s
        0x2e5s
        0x2e6s
        0x2efs
        0x2ebs
        0x2e4s
        0xc6bs
        0xc47s
        0xc54s
        0xc4ds
        0xc65s
        0xc49s
        0xc48s
        0xc50s
        0xc43s
        0xc54s
        0xc55s
        0xc47s
        0xc52s
        0xc4fs
        0xc49s
        0xc48s
        0xc74s
        0xc43s
        0xc47s
        0xc42s
        0xc6es
        0xc47s
        0xc48s
        0xc42s
        0xc4as
        0xc43s
        0xc54s
        0xc06s
        0xc42s
        0xc49s
        0xc74s
        0xc43s
        0xc57s
        0xc53s
        0xc43s
        0xc55s
        0xc52s
        0xc06s
        0xc4as
        0xc49s
        0xc45s
        0xc47s
        0xc4as
        0xc1cs
        0x66as
        0x640s
        0x659s
        0x654s
        0x67cs
        0x64ds
        0x64bs
        0x649s
        0x67cs
        0x64ds
        0x65es
        0x64ds
        0x641s
        0x65fs
        0x616s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x600s
        0x609s
        0x65fs
        0x8ccs
        0x8c9s
        0x8des
        0x8d0s
        0x8d5s
        0x8cfs
        0x8d4s
        0x204s
        0x203s
        0x201s
        0x209s
        0x21cs
        0x20ds
        0x20bs
        0x209s
        0x233s
        0x21fs
        0x204s
        0x203s
        0x21cs
        0x21cs
        0x205s
        0x202s
        0x20bs
        0x233s
        0x20fs
        0x20ds
        0x21es
        0x218s
        0xbcbs
        0xbc4s
        0xbces
        0xbd8s
        0xbc5s
        0xbc3s
        0xbces
        0xb84s
        0xbc9s
        0xbc5s
        0xbc4s
        0xbdes
        0xbcfs
        0xbc4s
        0xbdes
        0xb84s
        0xbe9s
        0xbc5s
        0xbc4s
        0xbdes
        0xbcfs
        0xbd2s
        0xbdes
        0xa89s
        0xa82s
        0xa95s
        0xa82s
        0xacds
        0xa8fs
        0xa82s
        0xa8ds
        0xa84s
        0xacds
        0xab0s
        0xa97s
        0xa91s
        0xa8as
        0xa8ds
        0xa84s
        0xbc3s
        0xbcfs
        0xbcds
        0xb8es
        0xbd3s
        0xbd3s
        0xb8es
        0xbc1s
        0xbces
        0xbc4s
        0xbd2s
        0xbcfs
        0xbc9s
        0xbc4s
        0xb8es
        0xbd5s
        0xbc7s
        0xbc3s
        0xb8es
        0xbc1s
        0xbd7s
        0xbc5s
        0xbcds
        0xbc5s
        0xb8es
        0xbc8s
        0xbcfs
        0xbcds
        0xbc5s
        0xbd0s
        0xbc1s
        0xbc7s
        0xbc5s
        0xb8es
        0xbd5s
        0xbc9s
        0xb8es
        0xbd6s
        0xbc9s
        0xbc5s
        0xbd7s
        0xb8es
        0xbeds
        0xbc1s
        0xbc9s
        0xbces
        0xbf4s
        0xbc1s
        0xbc2s
        0xce3s
        0xcebs
        0xcfds
        0xcf1s
        0xce7s
        0xce3s
        0xcf0s
        0xce1s
        0xceas
        0x631bs
        -0x7b34s
        -0x6bd5s
        -0x740as
        0x5f66s
        0x7f17s
        0x4a03s
        0x5fabs
        0x4b7cs
        0x5601s
        0x6c36s
        0x7f4fs
        0x59d4s
        0x57b3s
        0x784as
        0x9acs
        0x9a0s
        0x9a2s
        0x9e1s
        0x9bcs
        0x9bcs
        0x9e1s
        0x9aes
        0x9a1s
        0x9abs
        0x9bds
        0x9a0s
        0x9a6s
        0x9abs
        0x9e1s
        0x9bas
        0x9a8s
        0x9acs
        0x9e1s
        0x9aes
        0x9b8s
        0x9aas
        0x9a2s
        0x9aas
        0x9e1s
        0x9aas
        0x9a2s
        0x9a0s
        0x9a5s
        0x9a6s
        0x9e1s
        0x9bcs
        0x9a2s
        0x9aes
        0x9a3s
        0x9a3s
        0x9aas
        0x9a2s
        0x9a0s
        0x9a5s
        0x9a6s
        0x9e1s
        0x9a0s
        0x9a1s
        0x9a3s
        0x9a6s
        0x9a1s
        0x9aas
        0x9e1s
        0x9a2s
        0x9a0s
        0x9abs
        0x9aas
        0x9a3s
        0x9e1s
        0x980s
        0x9a1s
        0x9a3s
        0x9a6s
        0x9a1s
        0x9aas
        0x99cs
        0x9a2s
        0x9aes
        0x9a3s
        0x9a3s
        0x98as
        0x9a2s
        0x9a0s
        0x9a5s
        0x9a6s
        0x4aas
        0x4a6s
        0x4a4s
        0x4e7s
        0x4bas
        0x4bas
        0x4e7s
        0x4a8s
        0x4a7s
        0x4ads
        0x4bbs
        0x4a6s
        0x4a0s
        0x4ads
        0x4e7s
        0x4bcs
        0x4aes
        0x4aas
        0x4e7s
        0x4a8s
        0x4bes
        0x4acs
        0x4a4s
        0x4acs
        0x4e7s
        0x4aas
        0x4a6s
        0x4a4s
        0x4a4s
        0x4acs
        0x4a7s
        0x4bds
        0x4e7s
        0x4bcs
        0x4a0s
        0x4e7s
        0x48as
        0x4a6s
        0x4a4s
        0x4a4s
        0x4acs
        0x4a7s
        0x4bds
        0x485s
        0x4a0s
        0x4bas
        0x4bds
        0x499s
        0x4a8s
        0x4aes
        0x4acs
        0x48fs
        0x4bbs
        0x4a8s
        0x4aes
        0x4a4s
        0x4acs
        0x4a7s
        0x4bds
        0x1ecs
        0x1e3s
        0x1e9s
        0x1ffs
        0x1e2s
        0x1e4s
        0x1e9s
        0x1a3s
        0x1fbs
        0x1e4s
        0x1e8s
        0x1fas
        0x1a3s
        0x1dbs
        0x1e4s
        0x1e8s
        0x1fas
        0x1cas
        0x1ffs
        0x1e2s
        0x1f8s
        0x1fds
        0x9d8s
        0x9d7s
        0x9dds
        0x9cbs
        0x9d6s
        0x9d0s
        0x9dds
        0x997s
        0x9d6s
        0x9cas
        0x997s
        0x9fbs
        0x9ccs
        0x9d7s
        0x9dds
        0x9d5s
        0x9dcs
        0xa33s
        0xa3cs
        0xa36s
        0xa20s
        0xa3ds
        0xa3bs
        0xa36s
        0xa7cs
        0xa24s
        0xa3bs
        0xa37s
        0xa25s
        0xa7cs
        0xa1es
        0xa33s
        0xa2bs
        0xa3ds
        0xa27s
        0xa26s
        0xa1bs
        0xa3cs
        0xa34s
        0xa3es
        0xa33s
        0xa26s
        0xa37s
        0xa20s
        0x6cfs
        0x6c0s
        0x6cas
        0x6dcs
        0x6c1s
        0x6c7s
        0x6cas
        0x680s
        0x6d8s
        0x6c7s
        0x6cbs
        0x6d9s
        0x680s
        0x6f8s
        0x6c7s
        0x6cbs
        0x6d9s
        0x9ads
        0x98es
        0x98fs
        0x986s
        0x9a2s
        0x98ds
        0x988s
        0x982s
        0x98as
        0x9a7s
        0x994s
        0x98fs
        0x982s
        0x9a3s
        0x995s
        0x98fs
        0x9ccs
        0x993s
        0x984s
        0x986s
        0x988s
        0x992s
        0x995s
        0x984s
        0x993s
        0x9a7s
        0x994s
        0x98fs
        0x982s
        0x9c1s
        0x980s
        0x98ds
        0x993s
        0x984s
        0x980s
        0x985s
        0x998s
        0x9c1s
        0x993s
        0x984s
        0x986s
        0x988s
        0x992s
        0x995s
        0x984s
        0x993s
        0x984s
        0x985s
        0x9cds
        0x9c1s
        0x564s
        0x56fs
        0x578s
        0x56fs
        0x520s
        0x57bs
        0x57as
        0x567s
        0x562s
        0x520s
        0x55ds
        0x56bs
        0x57as
        0x389s
        0x380s
        0x39ds
        0x398s
        0x38es
        0x39ds
        0x38bs
        0xb77s
        0xb5bs
        0xb5as
        0xb40s
        0xb51s
        0xb5as
        0xb40s
        0xb70s
        0xb46s
        0xb51s
        0xb47s
        0xb47s
        0xb76s
        0xb41s
        0xb56s
        0xb56s
        0xb58s
        0xb51s
        0xb77s
        0xb51s
        0xb58s
        0xb58s
        0xb61s
        0xb7ds
        0xb7bs
        0xb44s
        0xb40s
        0x90es
        0x902s
        0x900s
        0x943s
        0x90fs
        0x914s
        0x919s
        0x908s
        0x909s
        0x90cs
        0x903s
        0x90es
        0x908s
        0x943s
        0x904s
        0x900s
        0x943s
        0x90es
        0x902s
        0x91fs
        0x908s
        0x943s
        0x900s
        0x902s
        0x909s
        0x908s
        0x901s
        0x943s
        0x920s
        0x908s
        0x91es
        0x91es
        0x90cs
        0x90as
        0x908s
        0x1c4s
        0x1cfs
        0x1d8s
        0x1cfs
        0x180s
        0x1c2s
        0x1cfs
        0x1c0s
        0x1c9s
        0x180s
        0x1fds
        0x1das
        0x1dcs
        0x1c7s
        0x1c0s
        0x1c9s
        0x588s
        0x584s
        0x586s
        0x5c5s
        0x598s
        0x598s
        0x5c5s
        0x58as
        0x585s
        0x58fs
        0x599s
        0x584s
        0x582s
        0x58fs
        0x5c5s
        0x59es
        0x58cs
        0x588s
        0x5c5s
        0x58as
        0x59cs
        0x58es
        0x586s
        0x58es
        0x5c5s
        0x598s
        0x583s
        0x58as
        0x599s
        0x58es
        0x599s
        0x5c5s
        0x59es
        0x582s
        0x5c5s
        0x5b8s
        0x583s
        0x58as
        0x599s
        0x58es
        0x5bbs
        0x58as
        0x588s
        0x580s
        0x58as
        0x58cs
        0x58es
        0x45fs
        0x453s
        0x451s
        0x412s
        0x44fs
        0x44fs
        0x412s
        0x45ds
        0x452s
        0x458s
        0x44es
        0x453s
        0x455s
        0x458s
        0x412s
        0x449s
        0x45bs
        0x45fs
        0x412s
        0x45ds
        0x44bs
        0x459s
        0x451s
        0x459s
        0x412s
        0x44fs
        0x454s
        0x45ds
        0x44es
        0x459s
        0x44es
        0x412s
        0x449s
        0x455s
        0x412s
        0x46fs
        0x454s
        0x45ds
        0x44es
        0x459s
        0x46cs
        0x45ds
        0x45fs
        0x457s
        0x45ds
        0x45bs
        0x459s
        0x418s
        0x47es
        0x449s
        0x455s
        0x450s
        0x458s
        0x459s
        0x44es
        0x893s
        0x89fs
        0x89ds
        0x8des
        0x883s
        0x883s
        0x8des
        0x891s
        0x89es
        0x894s
        0x882s
        0x89fs
        0x899s
        0x894s
        0x8des
        0x885s
        0x897s
        0x893s
        0x8des
        0x891s
        0x887s
        0x895s
        0x89ds
        0x895s
        0x8des
        0x893s
        0x89fs
        0x89ds
        0x89ds
        0x895s
        0x89es
        0x884s
        0x8des
        0x891s
        0x894s
        0x891s
        0x880s
        0x884s
        0x895s
        0x882s
        0x8des
        0x886s
        0x898s
        0x8des
        0x893s
        0x89fs
        0x89ds
        0x880s
        0x89fs
        0x89es
        0x895s
        0x89es
        0x884s
        0x883s
        0x8des
        0x8a4s
        0x899s
        0x89ds
        0x895s
        0x8bfs
        0x882s
        0x8a2s
        0x895s
        0x884s
        0x882s
        0x889s
        0x8b3s
        0x89fs
        0x89ds
        0x880s
        0x89fs
        0x89es
        0x895s
        0x89es
        0x884s
        0x947s
        0x94cs
        0x95bs
        0x94cs
        0x903s
        0x941s
        0x94cs
        0x943s
        0x94as
        0x903s
        0x962s
        0x94fs
        0x947s
        0x948s
        0x94es
        0x959s
        0x2c0s
        0x2c1s
        0x2e1s
        0x2cas
        0x2d8s
        0x2fas
        0x2dcs
        0x2cas
        0x2dds
        0x2ecs
        0x2c0s
        0x2das
        0x2c1s
        0x2dbs
        0x2ees
        0x2cbs
        0x2ces
        0x2dfs
        0x2dbs
        0x2cas
        0x2dds
        0x28fs
        0x28fs
        0x2c6s
        0x2dcs
        0x2e7s
        0x2c6s
        0x2cbs
        0x2cbs
        0x2cas
        0x2c1s
        0x28fs
        0x295s
        0x28fs
        0x855s
        0x859s
        0x85bs
        0x818s
        0x845s
        0x845s
        0x818s
        0x857s
        0x858s
        0x852s
        0x844s
        0x859s
        0x85fs
        0x852s
        0x818s
        0x843s
        0x851s
        0x855s
        0x818s
        0x857s
        0x841s
        0x853s
        0x85bs
        0x853s
        0x818s
        0x855s
        0x859s
        0x85bs
        0x85bs
        0x853s
        0x858s
        0x842s
        0x818s
        0x857s
        0x852s
        0x857s
        0x846s
        0x842s
        0x853s
        0x844s
        0x818s
        0x840s
        0x85es
        0x818s
        0x855s
        0x859s
        0x85bs
        0x846s
        0x859s
        0x858s
        0x853s
        0x858s
        0x842s
        0x845s
        0x818s
        0x862s
        0x85fs
        0x85bs
        0x853s
        0x879s
        0x844s
        0x864s
        0x853s
        0x842s
        0x844s
        0x84fs
        0x875s
        0x859s
        0x85bs
        0x846s
        0x859s
        0x858s
        0x853s
        0x858s
        0x842s
        0x117s
        0x118s
        0x112s
        0x104s
        0x119s
        0x11fs
        0x112s
        0x158s
        0x101s
        0x11fs
        0x112s
        0x111s
        0x113s
        0x102s
        0x158s
        0x122s
        0x113s
        0x10es
        0x102s
        0x120s
        0x11fs
        0x113s
        0x101s
        0xadfs
        0xad3s
        0xad1s
        0xa92s
        0xacfs
        0xacfs
        0xa92s
        0xadds
        0xad2s
        0xad8s
        0xaces
        0xad3s
        0xad5s
        0xad8s
        0xa92s
        0xac9s
        0xadbs
        0xadfs
        0xa92s
        0xadds
        0xacbs
        0xad9s
        0xad1s
        0xad9s
        0xa92s
        0xadas
        0xad9s
        0xad9s
        0xad8s
        0xa92s
        0xaccs
        0xadds
        0xad2s
        0xad9s
        0xad0s
        0xa92s
        0xafes
        0xadds
        0xacfs
        0xad9s
        0xaf0s
        0xad5s
        0xacfs
        0xac8s
        0xafas
        0xaces
        0xadds
        0xadbs
        0xad1s
        0xad9s
        0xad2s
        0xac8s
        0xaecs
        0xadds
        0xad2s
        0xad9s
        0xad0s
        0x6cas
        0x6c6s
        0x6c4s
        0x687s
        0x6das
        0x6das
        0x687s
        0x6c8s
        0x6c7s
        0x6cds
        0x6dbs
        0x6c6s
        0x6c0s
        0x6cds
        0x687s
        0x6dcs
        0x6ces
        0x6cas
        0x687s
        0x6c8s
        0x6des
        0x6ccs
        0x6c4s
        0x6ccs
        0x687s
        0x6cas
        0x6c6s
        0x6c4s
        0x6c4s
        0x6c6s
        0x6c7s
        0x687s
        0x6des
        0x6c0s
        0x6cds
        0x6ces
        0x6ccs
        0x6dds
        0x687s
        0x6ffs
        0x6ccs
        0x6dbs
        0x6dds
        0x6c0s
        0x6cas
        0x6c8s
        0x6c5s
        0x6ffs
        0x6c0s
        0x6ccs
        0x6des
        0x6f9s
        0x6c8s
        0x6ces
        0x6ccs
        0x6dbs
        0x43fs
        0x433s
        0x431s
        0x472s
        0x42fs
        0x42fs
        0x472s
        0x43ds
        0x432s
        0x438s
        0x42es
        0x433s
        0x435s
        0x438s
        0x472s
        0x429s
        0x43bs
        0x43fs
        0x472s
        0x43ds
        0x42bs
        0x439s
        0x431s
        0x439s
        0x472s
        0x43fs
        0x433s
        0x431s
        0x431s
        0x439s
        0x432s
        0x428s
        0x472s
        0x43ds
        0x438s
        0x43ds
        0x42cs
        0x428s
        0x439s
        0x42es
        0x472s
        0x42as
        0x434s
        0x472s
        0x43fs
        0x433s
        0x431s
        0x42cs
        0x433s
        0x432s
        0x439s
        0x432s
        0x428s
        0x42fs
        0x472s
        0x408s
        0x435s
        0x431s
        0x439s
        0x413s
        0x42es
        0x40es
        0x439s
        0x428s
        0x42es
        0x425s
        0x41fs
        0x433s
        0x431s
        0x42cs
        0x433s
        0x432s
        0x439s
        0x432s
        0x428s
        0x327s
        0x32bs
        0x329s
        0x36as
        0x337s
        0x337s
        0x36as
        0x325s
        0x32as
        0x320s
        0x336s
        0x32bs
        0x32ds
        0x320s
        0x36as
        0x331s
        0x323s
        0x327s
        0x36as
        0x325s
        0x333s
        0x321s
        0x329s
        0x321s
        0x36as
        0x327s
        0x32bs
        0x329s
        0x329s
        0x321s
        0x32as
        0x330s
        0x36as
        0x329s
        0x32bs
        0x320s
        0x321s
        0x328s
        0x36as
        0x307s
        0x32bs
        0x329s
        0x329s
        0x321s
        0x32as
        0x330s
        0xc02s
        0xc0es
        0xc0cs
        0xc4fs
        0xc03s
        0xc18s
        0xc15s
        0xc04s
        0xc05s
        0xc00s
        0xc0fs
        0xc02s
        0xc04s
        0xc4fs
        0xc00s
        0xc0fs
        0xc05s
        0xc13s
        0xc0es
        0xc08s
        0xc05s
        0xc4fs
        0xc0ds
        0xc08s
        0xc17s
        0xc04s
        0xc4fs
        0xc13s
        0xc0es
        0xc0es
        0xc0cs
        0xc4fs
        0xc16s
        0xc08s
        0xc05s
        0xc06s
        0xc04s
        0xc15s
        0xc4fs
        0xc2ds
        0xc08s
        0xc17s
        0xc04s
        0xc33s
        0xc0es
        0xc0es
        0xc0cs
        0xc20s
        0xc14s
        0xc05s
        0xc08s
        0xc04s
        0xc0fs
        0xc02s
        0xc04s
        0xc36s
        0xc08s
        0xc05s
        0xc06s
        0xc04s
        0xc15s
        0x393s
        0x394s
        0x38es
        0x721s
        0x72as
        0x73ds
        0x72as
        0x765s
        0x727s
        0x72as
        0x725s
        0x72cs
        0x765s
        0x718s
        0x73fs
        0x739s
        0x722s
        0x725s
        0x72cs
        0x9fes
        0x9e7s
        0x9e1s
        0x9ecs
        0x7cds
        0x7c1s
        0x7c3s
        0x780s
        0x7dds
        0x7dds
        0x780s
        0x7cfs
        0x7c0s
        0x7cas
        0x7dcs
        0x7c1s
        0x7c7s
        0x7cas
        0x780s
        0x7dbs
        0x7c9s
        0x7cds
        0x780s
        0x7cfs
        0x7d9s
        0x7cbs
        0x7c3s
        0x7cbs
        0x780s
        0x7c8s
        0x7c2s
        0x7dbs
        0x7d6s
        0x780s
        0x7cds
        0x7c1s
        0x7c3s
        0x7des
        0x7c1s
        0x7c0s
        0x7cbs
        0x7c0s
        0x7das
        0x780s
        0x7e7s
        0x7e8s
        0x7c2s
        0x7dbs
        0x7d6s
        0x7eds
        0x7c1s
        0x7c3s
        0x7des
        0x7c1s
        0x7c0s
        0x7cbs
        0x7c0s
        0x7das
        0x7fcs
        0x7cbs
        0x7c9s
        0x7c7s
        0x7dds
        0x7das
        0x7cbs
        0x7dcs
        0x74bs
        0x746s
        0xcdas
        0xcd5s
        0xcdfs
        0xcc9s
        0xcd4s
        0xcd2s
        0xcdfs
        0xc95s
        0xccds
        0xcd2s
        0xcdes
        0xcccs
        0xc95s
        0xceds
        0xcd2s
        0xcdes
        0xcccs
        0xa5fs
        0xa53s
        0xa51s
        0xa12s
        0xa4fs
        0xa4fs
        0xa12s
        0xa5ds
        0xa52s
        0xa58s
        0xa4es
        0xa53s
        0xa55s
        0xa58s
        0xa12s
        0xa49s
        0xa5bs
        0xa5fs
        0xa12s
        0xa5ds
        0xa4bs
        0xa59s
        0xa51s
        0xa59s
        0xa12s
        0xa5as
        0xa50s
        0xa49s
        0xa44s
        0xa12s
        0xa5fs
        0xa53s
        0xa51s
        0xa4cs
        0xa53s
        0xa52s
        0xa59s
        0xa52s
        0xa48s
        0xa12s
        0xa75s
        0xa7as
        0xa50s
        0xa49s
        0xa44s
        0xa7fs
        0xa53s
        0xa51s
        0xa4cs
        0xa53s
        0xa52s
        0xa59s
        0xa52s
        0xa48s
        0xa6es
        0xa59s
        0xa5bs
        0xa55s
        0xa4fs
        0xa48s
        0xa59s
        0xa4es
        0x36es
        0x363s
        0x2f0s
        0x2fds
        0x2fds
        0x2fes
        0x2f7s
        0x2f3s
        0x2fcs
        0x2c9s
        0x2c5s
        0x2c7s
        0x284s
        0x2d9s
        0x2d9s
        0x284s
        0x2cbs
        0x2c4s
        0x2ces
        0x2d8s
        0x2c5s
        0x2c3s
        0x2ces
        0x284s
        0x2dfs
        0x2cds
        0x2c9s
        0x284s
        0x2cbs
        0x2dds
        0x2cfs
        0x2c7s
        0x2cfs
        0x284s
        0x2c1s
        0x2c3s
        0x2dds
        0x2c3s
        0x284s
        0x2c7s
        0x2c5s
        0x2ces
        0x2cfs
        0x2c6s
        0x284s
        0x2fbs
        0x2e7s
        0x2c5s
        0x2ces
        0x2cfs
        0x2c6s
        0x38es
        0x3cfs
        0x3d5s
        0x3f3s
        0x3d5s
        0x3c7s
        0x3c4s
        0x3cas
        0x3c3s
        0x39bs
        0xce8s
        0xcfds
        0xcfes
        0xcc8s
        0xce5s
        0xcecs
        0xcf9s
        0xca1s
        0x767s
        0x77as
        0x762s
        0x727s
        0x587s
        0x591s
        0x598s
        0x591s
        0x597s
        0x580s
        0xa91s
        0xa9ds
        0xa9fs
        0xadcs
        0xa81s
        0xa81s
        0xadcs
        0xa93s
        0xa9cs
        0xa96s
        0xa80s
        0xa9ds
        0xa9bs
        0xa96s
        0xadcs
        0xa87s
        0xa95s
        0xa91s
        0xadcs
        0xa93s
        0xa85s
        0xa97s
        0xa9fs
        0xa97s
        0xadcs
        0xa97s
        0xa9fs
        0xa9ds
        0xa98s
        0xa9bs
        0xadcs
        0xa9fs
        0xa9ds
        0xa96s
        0xa97s
        0xa9es
        0xadcs
        0xab7s
        0xa9fs
        0xa9ds
        0xa98s
        0xa9bs
        0xa4as
        0xa45s
        0xa4fs
        0xa59s
        0xa44s
        0xa42s
        0xa4fs
        0xa05s
        0xa48s
        0xa44s
        0xa45s
        0xa5fs
        0xa4es
        0xa45s
        0xa5fs
        0xa05s
        0xa68s
        0xa44s
        0xa45s
        0xa5fs
        0xa4es
        0xa53s
        0xa5fs
        0x4c7s
        0x4c3s
        0x4d8s
        0x4c0s
        0x4c5s
        0x4c2s
        0x482s
        0x4c6s
        0x4das
        0x4c1s
        0x482s
        0x4cas
        0x4d9s
        0x4c2s
        0x4cfs
        0x4d8s
        0x4c5s
        0x4c3s
        0x4c2s
        0x4dfs
        0x482s
        0x4eas
        0x4d9s
        0x4c2s
        0x4cfs
        0x4d8s
        0x4c5s
        0x4c3s
        0x4c2s
        0x499s
        0x28es
        0x2dbs
        0x2dcs
        0x2dbs
        0x2c6s
        0x28cs
    .end array-data
.end method

.method constructor <init>(Ljava/lang/StringBuilder;Landroid/content/Context;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->failedItems:Ljava/lang/StringBuilder;

    iput-object p2, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->context:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p4, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->classLoader:Ljava/lang/ClassLoader;

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "pC"

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۠ۧ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private getBatch1Tasks()Ljava/util/List;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Lkevin/fun/hook/DexKitFinder$FinderTask;",
            ">;>;"
        }
    .end annotation

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    const/16 v29, 0x0

    const/16 v27, 0x0

    const/16 v25, 0x0

    const/16 v24, 0x0

    const/4 v9, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const-string v28, "\u06e3\u06e2\u06e7"

    :goto_0
    invoke-static/range {v28 .. v28}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v28

    sparse-switch v28, :sswitch_data_0

    const/16 v14, 0x2b6

    const/16 v25, 0xba4

    move-object/from16 v0, v26

    move/from16 v1, v29

    move/from16 v2, v25

    invoke-static {v0, v14, v1, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v14

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    invoke-direct {v0, v14, v10}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v14, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda30;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda30;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v26, v26, -0x3b

    const/16 v27, 0x2c8

    const/16 v28, 0x353

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v14}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v14, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda31;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda31;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v30, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, -0x11c

    move/from16 v29, v0

    const/16 v26, 0x2d6

    const/16 v27, 0x432

    move-object/from16 v0, v25

    move/from16 v1, v26

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v14}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v14, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda32;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda32;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    const-string v28, "\u06e2\u06e1\u06e0"

    goto/16 :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x3ce

    move/from16 v26, v0

    const/16 v27, 0xfe

    const/16 v28, 0x14b

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v25, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda1;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda1;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v27, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, -0x3ca

    move/from16 v27, v0

    const/16 v28, 0x10c

    const/16 v29, 0x340

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v27

    move/from16 v3, v29

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v27, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v27

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v28, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda2;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda2;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x151

    move/from16 v29, v0

    const/16 v25, 0x11b

    const/16 v27, 0x34b

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v28, "\u06e7\u06e5\u06e1"

    goto/16 :goto_0

    :sswitch_1
    new-instance v17, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v17

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v8}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v17

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v17, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda39;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda39;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x28b

    move/from16 v26, v0

    const/16 v27, 0x34d

    const/16 v28, 0x3b8

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v17

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v17, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda41;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda41;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x3a9

    move/from16 v29, v0

    const/16 v26, 0x35c

    const/16 v27, 0xab3

    move-object/from16 v0, v25

    move/from16 v1, v26

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v17

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v17, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda42;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda42;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    const-string v28, "\u06e0\u06e0\u06e3"

    goto/16 :goto_0

    :sswitch_2
    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v15, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda3;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda3;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x3b2

    move/from16 v26, v0

    const/16 v27, 0x129

    const/16 v28, 0x81d

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v15}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v15, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda5;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda5;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x1bd

    move/from16 v26, v0

    const/16 v27, 0x138

    const/16 v28, 0x4a0

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v15}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v15, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda6;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda6;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x2ea

    move/from16 v29, v0

    const-string v28, "\u06e5\u06e3\u06e4"

    goto/16 :goto_0

    :sswitch_3
    new-instance v5, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    invoke-direct {v5, v0, v7}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    invoke-static {v0, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v5, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda44;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda44;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v26, v26, -0x64

    const/16 v27, 0xb8

    const/16 v28, 0xadb

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v5}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v5, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda55;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda55;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v29, v26, 0x5d

    const/16 v26, 0xc5

    const/16 v27, 0x4db

    move-object/from16 v0, v25

    move/from16 v1, v26

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v5}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v5, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda66;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda66;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    const-string v28, "\u06e1\u06e7\u06e3"

    goto/16 :goto_0

    :sswitch_4
    new-instance v23, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda13;

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda13;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0xe3

    move/from16 v26, v0

    const/16 v27, 0x1b2

    const/16 v28, 0x2dc

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v23

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v23, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda14;

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda14;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x333

    move/from16 v26, v0

    const/16 v27, 0x1d2

    const/16 v28, 0x620

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    move-object/from16 v2, v23

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v23, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda15;

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda15;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, -0x1f8

    move/from16 v29, v0

    const/16 v27, 0x1e3

    const/16 v28, 0x448

    move-object/from16 v0, v26

    move/from16 v1, v27

    move/from16 v2, v29

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v27

    const-string v28, "\u06e2\u06e7\u06e5"

    goto/16 :goto_0

    :sswitch_5
    new-instance v20, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v20

    move-object/from16 v1, v27

    move-object/from16 v2, v23

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v20, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda17;

    move-object/from16 v0, v20

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda17;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x28b

    move/from16 v26, v0

    const/16 v27, 0x1f3

    const/16 v28, 0x22f

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v20, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda18;

    move-object/from16 v0, v20

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda18;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x1d4

    move/from16 v29, v0

    const/16 v26, 0x202

    const/16 v27, 0x681

    move-object/from16 v0, v25

    move/from16 v1, v26

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v20, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda19;

    move-object/from16 v0, v20

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda19;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v28, "\u06e5\u06e0\u06e1"

    goto/16 :goto_0

    :sswitch_6
    sget v25, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    move/from16 v0, v25

    xor-int/lit16 v0, v0, 0x3ae

    move/from16 v25, v0

    const/16 v27, 0x2e4

    const/16 v28, 0x2b9

    move-object/from16 v0, v26

    move/from16 v1, v27

    move/from16 v2, v25

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v14}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v25, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda34;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda34;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v27, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, 0x269

    move/from16 v27, v0

    const/16 v28, 0x2f2

    const/16 v29, 0x3cb

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v27

    move/from16 v3, v29

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v27, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v27

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v28, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda35;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda35;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x25c

    move/from16 v29, v0

    const/16 v25, 0x300

    const/16 v27, 0x544

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v28, "\u06e3\u06e8"

    goto/16 :goto_0

    :sswitch_7
    const/16 v11, 0x14b

    const/16 v25, 0xc55

    move-object/from16 v0, v26

    move/from16 v1, v29

    move/from16 v2, v25

    invoke-static {v0, v11, v1, v2}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v11

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    invoke-direct {v0, v11, v15}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v11, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda7;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda7;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x3ab

    move/from16 v26, v0

    const/16 v27, 0x15f

    const/16 v28, 0xb5b

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v11}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v11, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda8;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda8;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v30, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v29, v30, 0x12

    const/16 v26, 0x173

    const/16 v27, 0x18d

    move-object/from16 v0, v25

    move/from16 v1, v26

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v11}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v11, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda9;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda9;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    const-string v28, "\u06e2\u06e3\u06df"

    goto/16 :goto_0

    :sswitch_8
    const/16 v12, 0x42d

    const/16 v25, 0xa6a

    move-object/from16 v0, v26

    move/from16 v1, v29

    move/from16 v2, v25

    invoke-static {v0, v12, v1, v2}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v12

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v21

    invoke-direct {v0, v12, v1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v12, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda53;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda53;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x333

    move/from16 v26, v0

    const/16 v27, 0x43e

    const/16 v28, 0x16b

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v12}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v12, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda54;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda54;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v30, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x328

    move/from16 v29, v0

    const/16 v26, 0x44f

    const/16 v27, 0xadb

    move-object/from16 v0, v25

    move/from16 v1, v26

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v12}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v12, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda56;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda56;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    const-string v28, "\u06e4\u06e6\u06e7"

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v21, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda49;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda49;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x1f2

    move/from16 v26, v0

    const/16 v27, 0x401

    const/16 v28, 0x597

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v21

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v21, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda50;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda50;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x337

    move/from16 v26, v0

    const/16 v27, 0x419

    const/16 v28, 0x3c0

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v21

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v21, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda51;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda51;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x242

    move/from16 v29, v0

    const-string v28, "\u06e3\u06e0"

    goto/16 :goto_0

    :sswitch_a
    new-instance v18, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda59;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda59;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x3e0

    move/from16 v26, v0

    const/16 v27, 0x49d

    const/16 v28, 0xc7a

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v18

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v18, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda60;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda60;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x3dc

    move/from16 v26, v0

    const/16 v27, 0x4b9

    const/16 v28, 0x6dd

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    move-object/from16 v2, v18

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v18, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda61;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda61;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x27a

    move/from16 v29, v0

    const/16 v27, 0x4d6

    const/16 v28, 0x378

    move-object/from16 v0, v26

    move/from16 v1, v27

    move/from16 v2, v29

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v27

    const-string v28, "\u06df\u06e7\u06e1"

    goto/16 :goto_0

    :sswitch_b
    new-instance v13, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v18

    invoke-direct {v13, v0, v1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    invoke-static {v0, v13}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v13, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda62;

    move-object/from16 v0, p0

    invoke-direct {v13, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda62;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x33c

    move/from16 v26, v0

    const/16 v27, 0x4ff

    const/16 v28, 0x666

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v13}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v13, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda63;

    move-object/from16 v0, p0

    invoke-direct {v13, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda63;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x38e

    move/from16 v29, v0

    const/16 v26, 0x518

    const/16 v27, 0x7d9

    move-object/from16 v0, v25

    move/from16 v1, v26

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v13}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v13, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda65;

    move-object/from16 v0, p0

    invoke-direct {v13, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda65;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    const-string v28, "\u06df\u06e3\u06e3"

    goto/16 :goto_0

    :sswitch_c
    sget v25, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    move/from16 v0, v25

    xor-int/lit16 v0, v0, -0x257

    move/from16 v25, v0

    const/16 v27, 0x183

    const/16 v28, 0x709

    move-object/from16 v0, v26

    move/from16 v1, v27

    move/from16 v2, v25

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v11}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v25, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda10;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda10;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v27, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, 0x16a

    move/from16 v27, v0

    const/16 v28, 0x192

    const/16 v29, 0xaa2

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v27

    move/from16 v3, v29

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v27, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v27

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v28, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda12;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda12;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x289

    move/from16 v29, v0

    const/16 v25, 0x1a5

    const/16 v27, 0x250

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v28, "\u06e5\u06df"

    goto/16 :goto_0

    :sswitch_d
    new-instance v8, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda36;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda36;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v26, v26, 0x55

    const/16 v27, 0x30f

    const/16 v28, 0xb47

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v8}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v8, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda37;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda37;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x240

    move/from16 v26, v0

    const/16 v27, 0x32b

    const/16 v28, 0x46b

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    invoke-direct {v0, v1, v8}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v8, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda38;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda38;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x310

    move/from16 v29, v0

    const/16 v27, 0x33e

    const/16 v28, 0x761

    move-object/from16 v0, v26

    move/from16 v1, v27

    move/from16 v2, v29

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v27

    const-string v28, "\u06e8\u06e1\u06e7"

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v26, v26, -0x74

    const/16 v27, 0x3bc

    const/16 v28, 0x630

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v6}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v25, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda47;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda47;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v27, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, 0x24f

    move/from16 v27, v0

    const/16 v28, 0x3d2

    const/16 v29, 0xca5

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v27

    move/from16 v3, v29

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v27, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v27

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v28, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda48;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda48;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x175

    move/from16 v29, v0

    const/16 v25, 0x3ee

    const/16 v27, 0x40c

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v28, "\u06e5\u06e7\u06e6"

    goto/16 :goto_0

    :sswitch_f
    move/from16 v0, v30

    xor-int/lit16 v4, v0, 0x16c

    const/16 v25, 0x540

    const/16 v27, 0xb12

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v27

    invoke-static {v0, v1, v4, v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v4

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    invoke-direct {v0, v4, v13}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v4, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda67;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda67;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v26, v26, -0x43

    const/16 v27, 0x555

    const/16 v28, 0x187

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v4, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda68;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda68;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, -0x11f

    move/from16 v29, v0

    const/16 v25, 0x575

    const/16 v27, 0x944

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v4, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda69;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda69;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    const-string v28, "\u06e0\u06e0\u06e2"

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v4, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda72;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda72;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    sget v6, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v6, v6, 0x1a7

    const/16 v7, 0x5b1

    const/16 v8, 0x766

    invoke-static {v5, v7, v6, v8}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v6, v5, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    invoke-static {v0, v6}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v4, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda73;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda73;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    sget v6, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v6, v6, 0x174

    const/16 v7, 0x5c9

    const/16 v8, 0x7cd

    invoke-static {v5, v7, v6, v8}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v6, v5, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    invoke-static {v0, v6}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v22

    :sswitch_11
    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v10, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda26;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda26;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x281

    move/from16 v26, v0

    const/16 v27, 0x296

    const/16 v28, 0x678

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v10}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v10, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda27;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda27;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x24e

    move/from16 v26, v0

    const/16 v27, 0x2a2

    const/16 v28, 0x29e

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v10}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v10, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda29;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda29;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, -0xff

    move/from16 v29, v0

    const-string v28, "\u06e6\u06df\u06e1"

    goto/16 :goto_0

    :sswitch_12
    move/from16 v0, v30

    xor-int/lit16 v0, v0, -0xee

    move/from16 v19, v0

    const/16 v25, 0xd4

    const/16 v27, 0x412

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v19

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v19

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v19

    invoke-direct {v0, v1, v5}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v19, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda77;

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda77;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x3b7

    move/from16 v26, v0

    const/16 v27, 0xe3

    const/16 v28, 0x45d

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v19, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda86;

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda86;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x280

    move/from16 v29, v0

    const/16 v25, 0xf1

    const/16 v27, 0xcbf

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v19, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda87;

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda87;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    const-string v28, "\u06e2\u06e1\u06e8"

    goto/16 :goto_0

    :sswitch_13
    new-instance v22, Ljava/util/ArrayList;

    invoke-direct/range {v22 .. v22}, Ljava/util/ArrayList;-><init>()V

    new-instance v24, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda22;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda22;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v26, v26, -0x61

    const/16 v27, 0x0

    const/16 v28, 0x3c3

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v24

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v24, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda4;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda4;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x1d3

    move/from16 v26, v0

    const/16 v27, 0x15

    const/16 v28, 0xc83

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v24

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v24, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda16;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda16;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x3b5

    move/from16 v29, v0

    const-string v28, "\u06e1\u06e4\u06e8"

    goto/16 :goto_0

    :sswitch_14
    new-instance v7, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda75;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda75;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x220

    move/from16 v26, v0

    const/16 v27, 0x8a

    const/16 v28, 0x609

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v7}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v7, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda76;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda76;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x290

    move/from16 v26, v0

    const/16 v27, 0x98

    const/16 v28, 0xb90

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    invoke-direct {v0, v1, v7}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v7, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda33;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda33;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x175

    move/from16 v29, v0

    const/16 v27, 0xac

    const/16 v28, 0xc0c

    move-object/from16 v0, v26

    move/from16 v1, v27

    move/from16 v2, v29

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v27

    const-string v28, "\u06df\u06e5\u06e6"

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v26, v26, -0x2b

    const/16 v27, 0x255

    const/16 v28, 0x5d6

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v16

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v25, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda24;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda24;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v27, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, 0x17f

    move/from16 v27, v0

    const/16 v28, 0x273

    const/16 v29, 0x849

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v27

    move/from16 v3, v29

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v27, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v27

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v28, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda25;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda25;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, -0x1cf

    move/from16 v29, v0

    const/16 v25, 0x28c

    const/16 v27, 0x76c

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v28, "\u06e3\u06e7\u06e0"

    goto/16 :goto_0

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v26, v26, -0x70

    const/16 v27, 0x580

    const/16 v28, 0x5d4

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v25, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda70;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda70;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v27, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, 0x26c

    move/from16 v27, v0

    const/16 v28, 0x58a

    const/16 v29, 0x8aa

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v27

    move/from16 v3, v29

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v27, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v27

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v28, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda71;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda71;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x28f

    move/from16 v29, v0

    const/16 v25, 0x595

    const/16 v27, 0x53e

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v28, "\u06e0\u06e3\u06e2"

    goto/16 :goto_0

    :sswitch_17
    move/from16 v0, v30

    xor-int/lit16 v6, v0, -0x206

    const/16 v25, 0x36c

    const/16 v27, 0x5dd

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v27

    invoke-static {v0, v1, v6, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v6

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v17

    invoke-direct {v0, v6, v1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v6, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda43;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda43;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x246

    move/from16 v26, v0

    const/16 v27, 0x386

    const/16 v28, 0xabe

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v6}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v6, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda45;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda45;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x14a

    move/from16 v29, v0

    const/16 v25, 0x3a7

    const/16 v27, 0x81f

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v6}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v6, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda46;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda46;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    const-string v28, "\u06e0\u06e5\u06e4"

    goto/16 :goto_0

    :sswitch_18
    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x3af

    move/from16 v16, v0

    const/16 v25, 0x219

    const/16 v27, 0x436

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v16

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v16

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v16

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v16, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda20;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda20;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x110

    move/from16 v26, v0

    const/16 v27, 0x228

    const/16 v28, 0x180

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, v16

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v16, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda21;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda21;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x3aa

    move/from16 v29, v0

    const/16 v25, 0x242

    const/16 v27, 0x849

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v16

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v16, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda23;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda23;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    const-string v28, "\u06e2\u06e2\u06e2"

    goto/16 :goto_0

    :sswitch_19
    sget v25, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v25, v25, -0x3f

    const/16 v27, 0x66

    const/16 v28, 0xb76

    move-object/from16 v0, v26

    move/from16 v1, v27

    move/from16 v2, v25

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v9}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v25, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda64;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda64;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v27, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, 0x28a

    move/from16 v27, v0

    const/16 v28, 0x71

    const/16 v29, 0xc38

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v27

    move/from16 v3, v29

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v27, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v27

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v28, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda74;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda74;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, -0x215

    move/from16 v29, v0

    const/16 v25, 0x7f

    const/16 v27, 0x35d

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v28, "\u06e1\u06e0\u06e7"

    goto/16 :goto_0

    :sswitch_1a
    const/16 v9, 0x2b

    const/16 v25, 0x2f2

    move-object/from16 v0, v26

    move/from16 v1, v29

    move/from16 v2, v25

    invoke-static {v0, v9, v1, v2}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v9

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v24

    invoke-direct {v0, v9, v1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v9, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda28;

    move-object/from16 v0, p0

    invoke-direct {v9, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda28;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v26, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v26, v26, -0x6

    const/16 v27, 0x40

    const/16 v28, 0xc37

    move-object/from16 v0, v25

    move/from16 v1, v27

    move/from16 v2, v26

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v9}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v9, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda40;

    move-object/from16 v0, p0

    invoke-direct {v9, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda40;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v25

    sget v30, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x164

    move/from16 v29, v0

    const/16 v26, 0x56

    const/16 v27, 0x792

    move-object/from16 v0, v25

    move/from16 v1, v26

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v9}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v9, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda52;

    move-object/from16 v0, p0

    invoke-direct {v9, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda52;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    const-string v28, "\u06e2\u06e6\u06e8"

    goto/16 :goto_0

    :sswitch_1b
    sget v25, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v25, v25, 0x45

    const/16 v27, 0x459

    const/16 v28, 0xc53

    move-object/from16 v0, v26

    move/from16 v1, v27

    move/from16 v2, v25

    move/from16 v3, v28

    invoke-static {v0, v1, v2, v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v25

    new-instance v26, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct {v0, v1, v12}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v25, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda57;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda57;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v27, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v27, v27, 0x40

    const/16 v28, 0x470

    const/16 v29, 0x8e2

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v27

    move/from16 v3, v29

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v26

    new-instance v27, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v25

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v27

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v28, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda58;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda58;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v26

    sget v30, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    move/from16 v0, v30

    xor-int/lit16 v0, v0, 0x97

    move/from16 v29, v0

    const/16 v25, 0x482

    const/16 v27, 0x71e

    move-object/from16 v0, v26

    move/from16 v1, v25

    move/from16 v2, v29

    move/from16 v3, v27

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v27

    new-instance v25, Ljava/util/AbstractMap$SimpleEntry;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v28, "\u06e4\u06e5\u06e6"

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5d -> :sswitch_8
        0xdc65 -> :sswitch_d
        0xdc9a -> :sswitch_4
        0x1aa77f -> :sswitch_f
        0x1aa7c0 -> :sswitch_3
        0x1aa7f9 -> :sswitch_b
        0x1aaae2 -> :sswitch_16
        0x1aaae3 -> :sswitch_17
        0x1aab3f -> :sswitch_10
        0x1aab7f -> :sswitch_e
        0x1aaea8 -> :sswitch_14
        0x1aaf25 -> :sswitch_1a
        0x1aaf7d -> :sswitch_12
        0x1ab281 -> :sswitch_6
        0x1ab289 -> :sswitch_0
        0x1ab2a2 -> :sswitch_15
        0x1ab2be -> :sswitch_c
        0x1ab324 -> :sswitch_19
        0x1ab340 -> :sswitch_5
        0x1ab668 -> :sswitch_13
        0x1ab6fc -> :sswitch_11
        0x1aba85 -> :sswitch_a
        0x1abaa5 -> :sswitch_1b
        0x1abda6 -> :sswitch_18
        0x1abe06 -> :sswitch_7
        0x1abe84 -> :sswitch_9
        0x1ac5c3 -> :sswitch_2
        0x1ac90e -> :sswitch_1
    .end sparse-switch
.end method

.method private getBatch2Tasks()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Lkevin/fun/hook/DexKitFinder$FinderTask;",
            ">;>;"
        }
    .end annotation

    const/4 v13, 0x0

    const/4 v1, 0x0

    const-string v11, "\u06e6\u06e6\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    move-object v10, v1

    move v12, v13

    move v14, v13

    :goto_0
    invoke-static {v11}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    sget v12, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    const-string v11, "\u06e8\u06e0\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_0
    new-instance v0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda81;

    invoke-direct {v0, p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda81;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v11, "\u06df\u06e4\u06e0"

    move-object v8, v1

    goto :goto_0

    :sswitch_1
    sget v12, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v13, v12, 0x2ef

    const-string v1, "\u06e3\u06e0\u06e2"

    move-object v11, v1

    move v14, v13

    goto :goto_0

    :sswitch_2
    sget v12, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v13, v12, 0x393

    const-string v1, "\u06e8\u06e0\u06e0"

    move-object v11, v1

    move v14, v13

    goto :goto_0

    :sswitch_3
    xor-int/lit8 v13, v12, -0x77

    const/16 v1, 0x62c

    const/16 v9, 0x14e

    invoke-static {v8, v1, v13, v9}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v11, "\u06df\u06e0\u06e8"

    move-object v9, v1

    move v14, v13

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x638

    const/16 v9, 0xa3b

    invoke-static {v8, v1, v14, v9}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    new-instance v10, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v10, v1, v5}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v11, "\u06e7\u06df\u06e7"

    move-object v9, v1

    goto :goto_0

    :sswitch_5
    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v1, v9, v6}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v11, "\u06e8\u06e4\u06e1"

    move-object v10, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    sget v12, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    const-string v11, "\u06df\u06e6\u06e7"

    move-object v8, v1

    goto :goto_0

    :sswitch_7
    const/16 v1, 0x5f1

    const/16 v9, 0x882

    invoke-static {v8, v1, v14, v9}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    new-instance v10, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v10, v1, v3}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v11, "\u06e0\u06df\u06e8"

    move-object v9, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    sget v12, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    const-string v11, "\u06e2\u06e7\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v7, v10}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v1, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda80;

    invoke-direct {v1, p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda80;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    const-string v11, "\u06e4\u06e1\u06e7"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-static {v7, v10}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v7

    :sswitch_b
    xor-int/lit16 v13, v12, -0x1f2

    const/16 v1, 0x5db

    const/16 v9, 0xa5c

    invoke-static {v8, v1, v13, v9}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v11, "\u06e7\u06e1\u06e4"

    move-object v9, v1

    move v14, v13

    goto/16 :goto_0

    :sswitch_c
    xor-int/lit16 v13, v12, 0x115

    const/16 v1, 0x602

    const/16 v9, 0x4e9

    invoke-static {v8, v1, v13, v9}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v11, "\u06e7\u06e8\u06e2"

    move-object v9, v1

    move v14, v13

    goto/16 :goto_0

    :sswitch_d
    invoke-static {v7, v10}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v1, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda82;

    invoke-direct {v1, p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda82;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    const-string v11, "\u06e1\u06e1\u06e8"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_e
    sget v12, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v13, v12, 0x273

    const-string v1, "\u06df\u06e8\u06e0"

    move-object v11, v1

    move v14, v13

    goto/16 :goto_0

    :sswitch_f
    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v1, v9, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v11, "\u06e3\u06e4"

    move-object v10, v1

    goto/16 :goto_0

    :sswitch_10
    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v1, v9, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v11, "\u06e5\u06e3\u06e3"

    move-object v10, v1

    goto/16 :goto_0

    :sswitch_11
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda78;

    invoke-direct {v1, p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda78;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    const-string v11, "\u06e0\u06e7\u06e1"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_12
    new-instance v1, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda79;

    invoke-direct {v1, p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda79;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v8

    const-string v11, "\u06e3\u06e8"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_13
    const/16 v1, 0x61b

    const/16 v9, 0xa7f

    invoke-static {v8, v1, v14, v9}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v1

    new-instance v10, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v10, v1, v0}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v11, "\u06e8\u06e7\u06df"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_14
    new-instance v1, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda83;

    invoke-direct {v1, p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda83;-><init>(Lkevin/fun/hook/DexKitFinder$SafeFinder;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v8

    const-string v11, "\u06e4\u06e6\u06e2"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc61 -> :sswitch_0
        0xdc65 -> :sswitch_2
        0x1aa727 -> :sswitch_10
        0x1aa79b -> :sswitch_1
        0x1aa7e0 -> :sswitch_c
        0x1aa817 -> :sswitch_4
        0x1aaac9 -> :sswitch_9
        0x1aaec8 -> :sswitch_8
        0x1ab33f -> :sswitch_3
        0x1ab625 -> :sswitch_13
        0x1aba0a -> :sswitch_6
        0x1abaa0 -> :sswitch_e
        0x1abe05 -> :sswitch_14
        0x1ac224 -> :sswitch_11
        0x1ac50f -> :sswitch_a
        0x1ac54a -> :sswitch_5
        0x1ac621 -> :sswitch_f
        0x1ac8e8 -> :sswitch_7
        0x1ac8ec -> :sswitch_b
        0x1ac965 -> :sswitch_12
        0x1ac9c0 -> :sswitch_d
    .end sparse-switch
.end method

.method static synthetic lambda$52(Lorg/luckypray/dexkit/result/MethodData;)Z
    .locals 7

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۟ۦۧ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0x64c

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v5, v5, 0x30e

    const/16 v6, 0x7a1

    invoke-static {v3, v4, v5, v6}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۢۨۦ(Ljava/lang/Object;)I

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v0, 0x2

    if-ne v3, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤ۟ۤ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0x65d

    sget v5, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v5, v5, 0x270

    const/16 v6, 0x9b9

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v3, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤ۟ۤ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0x674

    sget v5, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v5, v5, -0x1f2

    const/16 v6, 0x37d

    invoke-static {v3, v4, v5, v6}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v3, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    move v0, v1

    :goto_5
    return v0

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    move v0, v2

    goto :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_e
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_e
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_d
    .end sparse-switch
.end method

.method static synthetic lambda$54(Lorg/luckypray/dexkit/result/MethodData;)Z
    .locals 7

    const/16 v2, 0x68e

    const/4 v1, 0x1

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۟ۦۧ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0x68a

    sget v5, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v5, v5, -0x67

    const/16 v6, 0x545

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    move v0, v2

    goto :goto_0

    :sswitch_1
    if-eqz v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۢۨۦ(Ljava/lang/Object;)I

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v0, 0x3

    if-ne v3, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤ۟ۤ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x21d

    const/16 v5, 0x9e9

    invoke-static {v3, v2, v4, v5}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v2, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1ea

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤ۟ۤ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x691

    sget v4, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v4, v4, 0x355

    const/16 v5, 0x30d

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v2, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    move v0, v1

    :goto_5
    return v0

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    const/4 v0, 0x0

    goto :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_e
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_e
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_d
    .end sparse-switch
.end method

.method static synthetic lambda$63(Lorg/luckypray/dexkit/result/MethodData;)Z
    .locals 5

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v2, 0x69f

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v3, v3, -0x7e

    const/16 v4, 0xc6b

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۥۨ(Ljava/lang/Object;)I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۦۡۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۡۧۥ(Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda84;

    invoke-direct {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda84;-><init>()V

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۢۨۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v0, 0x1

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    return v0

    :sswitch_a
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_b
    const/4 v0, 0x0

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method static synthetic lambda$64(Lorg/luckypray/dexkit/result/MethodData;)Z
    .locals 9

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v4, "\u06e4\u06e5\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    move v8, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v6, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v1, "\u06e2\u06e3\u06e8"

    move-object v4, v1

    move v7, v6

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v0

    const-string v1, "\u06e7\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    const/16 v1, 0x6a6

    const/16 v3, 0x1ad

    invoke-static {v0, v1, v8, v3}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e6\u06e8\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v3}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const-string v1, "\u06e1\u06e5\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡۧۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e3\u06e0\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v6, v7, 0x28a

    const-string v1, "\u06e6\u06e1\u06e4"

    move-object v4, v1

    move v8, v6

    goto :goto_0

    :sswitch_5
    return v5

    :sswitch_data_0
    .sparse-switch
        0x1aaf3f -> :sswitch_5
        0x1ab2c7 -> :sswitch_4
        0x1ab629 -> :sswitch_0
        0x1aba87 -> :sswitch_3
        0x1ac189 -> :sswitch_1
        0x1ac25e -> :sswitch_2
    .end sparse-switch
.end method

.method public static ۟۟۟ۦۧ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getReturnType()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    iget-object v0, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->classLoader:Ljava/lang/ClassLoader;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۡۡۦ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldDataList;->isEmpty()Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۢ۠۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۥۥ۟(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/MethodDataList;->get(I)Ljava/lang/Object;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, Lorg/luckypray/dexkit/query/FindField;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠۠ۤۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldDataList;->size()I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠ۢ۠ۢ()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->create()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/enums/UsingType;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠ۦ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡۢ۟ۥ()V
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$smforceGC()V

    :sswitch_3
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "7GX00"

    invoke-static {v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡۧۦۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۡۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addInvoke(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getParamTypes()Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addInterface(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    iget-object v0, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۦۦۨ(IILjava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$smupdateProgress(IILjava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣ۟ۢۨ(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldDataList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingNumber(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۡۢۢ()Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۢ۠۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodDataList;->getSize()I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۢۥۢ(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodDataList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤ۠ۡۧ()I
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$sfgettaskCounter()I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lkevin/fun/hook/DexKitFinder$FinderTask;

    invoke-virtual {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->find(Ljava/lang/String;Lkevin/fun/hook/DexKitFinder$FinderTask;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/FindClass;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindClass;->matcher(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/FindField;->create()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۡۧۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/AnnotationData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationData;->getTypeName()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۢ۟ۢ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    invoke-direct {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->getBatch2Tasks()Ljava/util/List;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۤۥۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/AnnotationData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationData;->toString()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦ۠ۦ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۢۨۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassDataList;->size()I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/FindField;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindField;->matcher(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧ۠ۤ۠()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$sfgetcurrentTask()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۧۡۦ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getParamTypeNames()Ljava/util/List;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۡۥۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassData;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/FindClass;->create()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->create()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۤۢۢ()Ljava/util/Map;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$sfgetTASK_NAMES()Ljava/util/Map;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۧۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getMethods()Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldDataList;->firstOrNull()Ljava/lang/Object;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۧۦ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodDataList;->isEmpty()Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassDataList;->firstOrNull()Ljava/lang/Object;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠۠ۦ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DexKitFinder$FinderTask;

    invoke-interface {p0}, Lkevin/fun/hook/DexKitFinder$FinderTask;->run()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠ۤ۟ۤ(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassDataList;->get(I)Ljava/lang/Object;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠ۤۤۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getReturnTypeName()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡ۠ۢۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getTypeName()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡۡۧۥ(Ljava/lang/Object;)Ljava/util/stream/Stream;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodDataList;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡۦۡۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 2

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getInvokes()Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡۦۤۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getName()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/FindField;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindField;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢ۠ۦۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getModifiers()I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۤۥ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getUsingStrings()Ljava/util/List;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۦ۟۟(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiers(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۨۦ۟(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 2

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getFields()Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۨۦ۠(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠۠ۤ(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    iget-object v0, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->failedItems:Ljava/lang/StringBuilder;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, Ljava/lang/ClassLoader;

    check-cast p2, [Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$smfindClassByStrings(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, [Ljava/lang/Number;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbers([Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۧۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۤۤۧ(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassDataList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۤۧۥ()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->create()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۧۡۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getModifiers()I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۡۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addCaller(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, [Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$smfindMethodNameByStrings(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodDataList;->firstOrNull()Ljava/lang/Object;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getName()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦ۠ۡۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۢ۠ۥ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۣۢۨ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    invoke-direct {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->getBatch1Tasks()Ljava/util/List;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->create()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۤۡۦ()V
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$smtriggerGC()V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "q6X8VJPtjx"

    invoke-static {v0}, Landroidx/appcompat/ۣۧۤۢ;->۟۟ۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/FindMethod;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۤۦۣ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$smisTargetPackage(Ljava/lang/String;)Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۥۨۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/FindMethod;->create()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۧۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;->addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۨ۟۠(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getAnnotations()Ljava/util/List;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۨ۠ۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getType()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۡۤۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDeclaredClassName()Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/FindMethod;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindMethod;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۨۥۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getParamCount()I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۥۢۨ()Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Read:Lorg/luckypray/dexkit/query/enums/UsingType;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۦۣ۟()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$sfgettotalTasks()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۦ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۦۤ()[S
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DexKitFinder$SafeFinder;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۧۨ۠(I)V
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder;->_$$Nest$sfputtaskCounter(I)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method executeBatch1()V
    .locals 4

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۣۢۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :sswitch_0
    invoke-static {v2}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {v2}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۠ۢۤۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->۟ۦۢۦۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/DexKitFinder$FinderTask;

    invoke-static {p0, v1, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۠ۡۧ()I

    move-result v1

    sget v3, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    xor-int/lit16 v0, v3, 0x132

    rem-int v0, v1, v0

    if-nez v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡۢ۟ۥ()V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v0, 0xbe22

    goto :goto_2

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_8
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_0
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_0
    .end sparse-switch
.end method

.method executeBatch2()V
    .locals 4

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۢ۟ۢ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :sswitch_0
    invoke-static {v2}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡۢ۟ۥ()V

    return-void

    :sswitch_4
    invoke-static {v2}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۠ۢۤۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->۟ۦۢۦۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/DexKitFinder$FinderTask;

    invoke-static {p0, v1, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۠ۡۧ()I

    move-result v1

    sget v3, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    xor-int/lit16 v0, v3, -0x1bc

    rem-int v0, v1, v0

    if-nez v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡۢ۟ۥ()V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    const v0, 0xbe22

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_0
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb97b -> :sswitch_0
    .end sparse-switch
.end method

.method find(Ljava/lang/String;Lkevin/fun/hook/DexKitFinder$FinderTask;)V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۠ۤ۠()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۠ۡۧ()I

    move-result v0

    sget v2, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v2, v2, -0xe4

    add-int/2addr v0, v2

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۧۨ۠(I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۣ۟()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۢۢ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p1, p1}, Landroidx/versionedparcelable/۠ۡۧۤ;->۠ۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۦۦۨ(IILjava/lang/Object;)V

    invoke-static {p2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠۠ۦ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p1, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x6b4

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v4, v4, -0x1f8

    const/16 v5, 0x6e0

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x6c4

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x322

    const/16 v5, 0x60b

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۢ۠ۥ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۠ۡۧ()I

    move-result v1

    sget v2, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    xor-int/lit16 v0, v2, 0x1e6

    rem-int v0, v1, v0

    if-nez v0, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡۦ()V

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    return-void

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_b
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v2, 0x6c7

    sget v3, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v3, v3, -0xe7

    const/16 v4, 0x34a

    invoke-static {v1, v2, v3, v4}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x6cb

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v4, v4, 0x29d

    const/16 v5, 0x710

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x6db

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x50

    const/16 v5, 0x274

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۢ۠ۥ(Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۠ۤ(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    monitor-enter v1

    :try_start_1
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۠ۤ(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x6e0

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x78

    const/16 v5, 0xb7c

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x6e2

    const/4 v4, 0x1

    const/16 v5, 0x16d

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    monitor-exit v1

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method synthetic lambda$0$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e7\u06e5\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v8, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const-string v1, "\u06df\u06e5\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v9, v8, -0x336

    const-string v1, "\u06e4\u06e8\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_1
    sget v8, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    const-string v1, "\u06e5\u06e6\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v0, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e8\u06e3\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x6e3

    const/16 v5, 0x400

    invoke-static {v6, v1, v10, v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e4\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v9, v8, -0x25a

    const-string v1, "\u06e6\u06e3\u06e1"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "\u06e8\u06e8\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e2\u06e8\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e1\u06e6\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    aput-object v5, v4, v10

    const-string v1, "\u06e7\u06e0\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcba -> :sswitch_a
        0x1aa7be -> :sswitch_0
        0x1aaf5e -> :sswitch_1
        0x1abae1 -> :sswitch_4
        0x1abe61 -> :sswitch_5
        0x1ac1c4 -> :sswitch_9
        0x1ac1e4 -> :sswitch_8
        0x1ac52d -> :sswitch_2
        0x1ac5c2 -> :sswitch_3
        0x1ac947 -> :sswitch_6
        0x1ac9e7 -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic lambda$1$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e0\u06df\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v9, v11, -0x3c2

    const-string v1, "\u06e2\u06e1\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0x6fa

    const/16 v3, 0x5cc

    invoke-static {v7, v1, v9, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e7\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v10, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    const-string v1, "\u06e4\u06e1\u06e5"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v9, v11, 0x12e

    const-string v1, "\u06df\u06e6\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v9, v11, -0xee

    const-string v1, "\u06e6\u06e2\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    sget v10, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    const-string v1, "\u06e8\u06e0\u06e3"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v9, v11, -0x270

    const-string v1, "\u06e1\u06e0\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e1\u06e8\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    sget v10, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    const-string v1, "\u06df\u06e6\u06e1"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    const-string v1, "\u06e4\u06e8\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v9, v11, -0x333

    const-string v1, "\u06e7\u06e1\u06df"

    move-object v8, v1

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e3\u06e6\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_b
    aput-object v5, v2, v9

    const-string v1, "\u06e0\u06e7\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_c
    sget v10, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    const-string v1, "\u06e6\u06e6\u06df"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_d
    const/16 v1, 0x70a

    const/16 v4, 0x6f5

    invoke-static {v7, v1, v9, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06df\u06df\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_e
    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e0\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_f
    sget v10, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const-string v1, "\u06e2\u06df\u06e3"

    move-object v8, v1

    move v11, v10

    goto/16 :goto_0

    :sswitch_10
    xor-int/lit8 v9, v11, 0x5a

    const-string v1, "\u06df\u06e0\u06e5"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_11
    aput-object v4, v2, v9

    const-string v1, "\u06e5\u06e6\u06e8"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e5\u06e8"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_13
    sget v10, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    const-string v1, "\u06e0\u06e4\u06e3"

    move-object v8, v1

    move v11, v10

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e3\u06e5\u06e7"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_15
    const/16 v1, 0x702

    const/16 v5, 0x681

    invoke-static {v7, v1, v9, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e1\u06e0\u06e2"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_16
    aput-object v3, v2, v9

    const-string v1, "\u06e1\u06e1\u06e3"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_17
    return-object v6

    :sswitch_data_0
    .sparse-switch
        0xdc03 -> :sswitch_17
        0xdca3 -> :sswitch_f
        0xdcdd -> :sswitch_a
        0x1aa702 -> :sswitch_6
        0x1aa724 -> :sswitch_15
        0x1aa7db -> :sswitch_0
        0x1aaac0 -> :sswitch_8
        0x1aab5f -> :sswitch_3
        0x1aabba -> :sswitch_e
        0x1aaea3 -> :sswitch_12
        0x1aaea9 -> :sswitch_11
        0x1aaec3 -> :sswitch_7
        0x1aaf9e -> :sswitch_1
        0x1ab246 -> :sswitch_9
        0x1ab287 -> :sswitch_b
        0x1ab6c5 -> :sswitch_c
        0x1ab6dd -> :sswitch_4
        0x1aba08 -> :sswitch_5
        0x1abae4 -> :sswitch_14
        0x1abe67 -> :sswitch_13
        0x1ac1a5 -> :sswitch_16
        0x1ac21f -> :sswitch_2
        0x1ac545 -> :sswitch_d
        0x1ac8eb -> :sswitch_10
    .end sparse-switch
.end method

.method synthetic lambda$10$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06df\u06e6\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v9, v8, -0x3b6

    const-string v1, "\u06e0\u06e7\u06e7"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_0
    aput-object v5, v4, v10

    const-string v1, "\u06e8\u06e0\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e7\u06e0\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e6\u06e6\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v9, v8, 0x36d

    const-string v1, "\u06e7\u06df\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_4
    sget v8, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    const-string v1, "\u06e4\u06e4\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    sget v8, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    const-string v1, "\u06e8\u06e3\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    const/16 v1, 0x725

    const/16 v2, 0x91d

    invoke-static {v6, v1, v10, v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e5\u06e0\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e5\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    const-string v1, "\u06e3\u06e1\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    const/16 v1, 0x71a

    const/16 v5, 0x365

    invoke-static {v6, v1, v10, v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e3\u06e2\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v9, v8, -0xed

    const-string v1, "\u06e7\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_c
    xor-int/lit8 v9, v8, 0x3

    const-string v1, "\u06e4\u06e6\u06e6"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_d
    sget v8, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    const-string v1, "\u06df\u06e8\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_e
    aput-object v2, v4, v10

    const-string v1, "\u06df\u06e5\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_f
    sget v8, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    const-string v1, "\u06e2\u06e5\u06e3"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_10
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdc9f -> :sswitch_f
        0xdcb9 -> :sswitch_8
        0xdce1 -> :sswitch_0
        0x1aa7be -> :sswitch_1
        0x1aa7e0 -> :sswitch_9
        0x1aabc0 -> :sswitch_a
        0x1ab300 -> :sswitch_b
        0x1ab64a -> :sswitch_2
        0x1ab663 -> :sswitch_7
        0x1aba66 -> :sswitch_c
        0x1abaa4 -> :sswitch_e
        0x1abdad -> :sswitch_5
        0x1ac224 -> :sswitch_d
        0x1ac50d -> :sswitch_6
        0x1ac528 -> :sswitch_10
        0x1ac8e9 -> :sswitch_4
        0x1ac94b -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic lambda$11$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e6\u06df\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v8, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    const-string v1, "\u06e7\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit8 v9, v8, -0x14

    const-string v1, "\u06e4\u06e5\u06e0"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v9, v8, 0x17c

    const-string v1, "\u06e6\u06e3"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_2
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e2\u06e8\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    aput-object v0, v5, v10

    const-string v1, "\u06e4\u06e3\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e8\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit8 v9, v8, 0x53

    const-string v1, "\u06df\u06e4\u06e2"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_6
    aput-object v3, v5, v10

    const-string v1, "\u06e5\u06e0\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e7\u06e7\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v9, v8, -0x1bf

    const-string v1, "\u06e0\u06e2\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_9
    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e2\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_a
    const/16 v1, 0x763

    const/16 v3, 0x397

    invoke-static {v6, v1, v10, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e6\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_b
    sget v8, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    const-string v1, "\u06e2\u06e4\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_c
    sget v8, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const-string v1, "\u06e8\u06e7\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06df\u06e0\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_e
    const/16 v0, 0x75b

    const/16 v1, 0x8a5

    invoke-static {v6, v0, v10, v1}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e1\u06e6\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_f
    sget v8, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    const-string v1, "\u06e0\u06e5\u06e3"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_10
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdcbd -> :sswitch_e
        0xdce1 -> :sswitch_0
        0xdcfb -> :sswitch_c
        0x1aa725 -> :sswitch_f
        0x1aa75f -> :sswitch_10
        0x1aa79d -> :sswitch_6
        0x1aa7de -> :sswitch_2
        0x1aab23 -> :sswitch_a
        0x1aab7e -> :sswitch_1
        0x1aaf5d -> :sswitch_4
        0x1ab2dd -> :sswitch_5
        0x1aba40 -> :sswitch_b
        0x1aba7f -> :sswitch_3
        0x1abda9 -> :sswitch_9
        0x1ac14a -> :sswitch_7
        0x1ac607 -> :sswitch_d
        0x1ac9c9 -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$12$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e2\u06e6\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0x774

    const/16 v4, 0xb66

    invoke-static {v7, v1, v11, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e4\u06e1\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v10, v9, 0x334

    const-string v1, "\u06e6\u06e4"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06df\u06e2\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    sget v9, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v1, "\u06e2\u06e4\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e7\u06e6\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e1\u06df\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    sget v9, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    const-string v1, "\u06e1\u06e4\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v8, "\u06e8\u06df\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    const/16 v1, 0x783

    const/16 v3, 0x7e1

    invoke-static {v7, v1, v11, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e6\u06e3\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v10, v9, 0x3a0

    const-string v1, "\u06e5\u06df\u06e1"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_9
    invoke-static {v0, v2, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e8\u06e4\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    aput-object v4, v6, v11

    const-string v1, "\u06e6\u06e3\u06df"

    move-object v8, v1

    goto :goto_0

    :sswitch_b
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    const-string v1, "\u06e5\u06e8\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit8 v10, v9, -0x62

    const-string v1, "\u06e8\u06e8"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_d
    sget v9, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const-string v1, "\u06e4\u06e1\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_e
    xor-int/lit16 v10, v9, -0x333

    const-string v1, "\u06e3\u06e1\u06e1"

    move-object v8, v1

    move v11, v10

    goto/16 :goto_0

    :sswitch_f
    aput-object v3, v6, v11

    const-string v1, "\u06e3\u06e2\u06e0"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_10
    sget v9, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    const-string v1, "\u06e3\u06e7\u06e8"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_11
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbe -> :sswitch_f
        0x1aa765 -> :sswitch_10
        0x1aae84 -> :sswitch_d
        0x1aaf1e -> :sswitch_0
        0x1ab2e0 -> :sswitch_8
        0x1ab324 -> :sswitch_b
        0x1ab643 -> :sswitch_7
        0x1ab661 -> :sswitch_9
        0x1ab704 -> :sswitch_c
        0x1aba02 -> :sswitch_4
        0x1aba04 -> :sswitch_e
        0x1abd87 -> :sswitch_a
        0x1abea3 -> :sswitch_6
        0x1ac1c2 -> :sswitch_5
        0x1ac1c9 -> :sswitch_3
        0x1ac5e8 -> :sswitch_2
        0x1ac8d1 -> :sswitch_1
        0x1ac963 -> :sswitch_11
    .end sparse-switch
.end method

.method synthetic lambda$13$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e2\u06e2\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v8, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    const-string v1, "\u06e0\u06e0\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e4\u06e3\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    aput-object v3, v6, v10

    const-string v1, "\u06e6\u06e4\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e5\u06e3\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v9, v8, -0x323

    const-string v1, "\u06e7\u06e0\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e0\u06e7\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v9, v8, 0x1a5

    const-string v1, "\u06e4\u06e0\u06e3"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v4, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e4\u06e3\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e6\u06e4\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_8
    const/16 v1, 0x793

    const/16 v3, 0x772

    invoke-static {v5, v1, v10, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e0\u06e6\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_9
    sget v8, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const-string v1, "\u06e3\u06e6\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaae3 -> :sswitch_5
        0x1aab9c -> :sswitch_2
        0x1ab2a6 -> :sswitch_7
        0x1ab6dc -> :sswitch_3
        0x1ab9e7 -> :sswitch_8
        0x1aba42 -> :sswitch_a
        0x1aba43 -> :sswitch_4
        0x1abe05 -> :sswitch_9
        0x1ac1e1 -> :sswitch_6
        0x1ac1e9 -> :sswitch_0
        0x1ac52f -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic lambda$14$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e3\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0x7ad

    const/16 v2, 0x209

    invoke-static {v0, v1, v8, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e7\u06e3\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    sget v9, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    const-string v1, "\u06e3\u06e7\u06e0"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_1
    sget v9, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    const-string v1, "\u06e4\u06e7\u06e4"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_2
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e7\u06e1\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    aput-object v2, v4, v8

    const-string v1, "\u06e4\u06e5\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06df\u06e4\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e8\u06e4\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v8, v10, -0x1e8

    const-string v1, "\u06e0\u06e5\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v5, v6, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e5\u06df\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v8, v10, 0x33a

    const-string v1, "\u06df\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v0

    const-string v1, "\u06e3\u06e0\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc65 -> :sswitch_4
        0x1aa79f -> :sswitch_5
        0x1aab7b -> :sswitch_3
        0x1ab62b -> :sswitch_1
        0x1ab6fc -> :sswitch_6
        0x1aba83 -> :sswitch_7
        0x1abac1 -> :sswitch_8
        0x1abd8d -> :sswitch_a
        0x1ac54a -> :sswitch_0
        0x1ac58b -> :sswitch_2
        0x1ac964 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$15$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e3\u06e1\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e8\u06e8\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "\u06e1\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e4\u06e4\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit8 v8, v10, -0x63

    const-string v1, "\u06e0\u06e7\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    aput-object v2, v3, v8

    const-string v1, "\u06e1\u06e8\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x7c5

    const/16 v2, 0xa29

    invoke-static {v4, v1, v8, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e1\u06e7\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    sget v9, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const-string v1, "\u06e3\u06e8\u06e7"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v8, v10, -0x1b2

    const-string v1, "\u06e4\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v5, v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e6\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e4\u06e3\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    sget v9, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    const-string v1, "\u06e1\u06e8\u06df"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_a
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc22 -> :sswitch_1
        0xdc84 -> :sswitch_4
        0x1aabb8 -> :sswitch_3
        0x1aaf98 -> :sswitch_2
        0x1aafa0 -> :sswitch_7
        0x1ab641 -> :sswitch_8
        0x1ab722 -> :sswitch_6
        0x1aba48 -> :sswitch_0
        0x1aba62 -> :sswitch_5
        0x1ac9a7 -> :sswitch_a
        0x1ac9e1 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$16$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e4\u06e4\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e0\u06e1\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "\u06df\u06e6\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    sget v8, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    const-string v1, "\u06df\u06e7\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    aput-object v3, v6, v10

    const-string v1, "\u06e8\u06df\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v2, v0, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e7\u06e5\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x7e3

    const/16 v3, 0x991

    invoke-static {v4, v1, v10, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e4\u06e1\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    sget v8, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v1, "\u06e3\u06e3\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v9, v8, 0x3b3

    const-string v1, "\u06e0\u06e1\u06e3"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v9, v8, -0x3c7

    const-string v1, "\u06e3\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e4\u06e6\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_9
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e1\u06e8\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc65 -> :sswitch_2
        0x1aa7f7 -> :sswitch_7
        0x1aab02 -> :sswitch_4
        0x1aab07 -> :sswitch_5
        0x1aaf9f -> :sswitch_1
        0x1ab687 -> :sswitch_6
        0x1aba04 -> :sswitch_9
        0x1aba64 -> :sswitch_8
        0x1aba9e -> :sswitch_0
        0x1ac5c3 -> :sswitch_a
        0x1ac8cd -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic lambda$17$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e6\u06e3\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    aput-object v2, v0, v10

    const-string v1, "\u06e4\u06e3\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    sget v8, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    const-string v1, "\u06e1\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e5\u06e5\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    sget v8, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    const-string v1, "\u06e8\u06df\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v9, v8, -0xfc

    const-string v1, "\u06e4\u06e2\u06e3"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v9, v8, 0x322

    const-string v1, "\u06e8\u06e6\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_5
    invoke-static {v3, v5, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e0\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u06e3\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e6\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e2\u06e3\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    const/16 v1, 0x7f6

    const/16 v2, 0x7e3

    invoke-static {v4, v1, v10, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e1\u06e2\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_a
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_a
        0xdc25 -> :sswitch_3
        0xdc64 -> :sswitch_2
        0xdcc2 -> :sswitch_0
        0x1aaee6 -> :sswitch_6
        0x1ab2c7 -> :sswitch_7
        0x1aba25 -> :sswitch_9
        0x1aba41 -> :sswitch_5
        0x1abe44 -> :sswitch_8
        0x1ac1c9 -> :sswitch_1
        0x1ac8cd -> :sswitch_4
    .end sparse-switch
.end method

.method synthetic lambda$18$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e3\u06e7\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object v2

    :sswitch_0
    sget v8, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    const-string v1, "\u06e1\u06e6\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v9, v8, 0xf3

    const-string v1, "\u06e7\u06df\u06e7"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e2\u06e1\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    aput-object v0, v6, v10

    const-string v1, "\u06e7\u06e5\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v9, v8, -0x13d

    const-string v1, "\u06e1\u06df\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_5
    sget v8, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    const-string v1, "\u06e5\u06e1\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    const/16 v0, 0x80d

    const/16 v1, 0x4c6

    invoke-static {v3, v0, v10, v1}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e8\u06e8\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e4\u06e3\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e7\u06df\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v4, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e8\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e1\u06e6\u06e3"

    move-object v5, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aae87 -> :sswitch_6
        0x1aaf5c -> :sswitch_4
        0x1aaf5e -> :sswitch_2
        0x1ab288 -> :sswitch_0
        0x1ab704 -> :sswitch_7
        0x1aba45 -> :sswitch_a
        0x1abdc8 -> :sswitch_1
        0x1ac50f -> :sswitch_3
        0x1ac510 -> :sswitch_5
        0x1ac5c4 -> :sswitch_9
        0x1ac9e4 -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$19$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e5\u06e4\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v9, v8, 0x11f

    const-string v1, "\u06e7\u06e2"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_0
    invoke-static {v6, v0, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e5\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "\u06e3\u06e2\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    sget v8, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    const-string v1, "\u06e3\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e1\u06e5\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e6\u06e0\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e1\u06e1\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_6
    const/16 v1, 0x836

    const/16 v3, 0xbe1

    invoke-static {v2, v1, v10, v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e1\u06e2\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    aput-object v3, v4, v10

    const-string v1, "\u06e8\u06e6\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    sget v8, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    const-string v1, "\u06e7\u06e1\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v9, v8, 0x15f

    const-string v1, "\u06e8\u06e1\u06df"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_a
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5f -> :sswitch_9
        0xdcdb -> :sswitch_6
        0x1aaec5 -> :sswitch_8
        0x1aaee3 -> :sswitch_4
        0x1aaf3c -> :sswitch_1
        0x1ab661 -> :sswitch_5
        0x1abe22 -> :sswitch_3
        0x1ac16c -> :sswitch_2
        0x1ac206 -> :sswitch_a
        0x1ac906 -> :sswitch_7
        0x1ac9a9 -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic lambda$2$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e6\u06e3\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e3\u06e1\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e2\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v9, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v1, "\u06e5\u06e1"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v0

    const-string v1, "\u06e8\u06e1\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    const/16 v1, 0x849

    const/16 v2, 0xb13

    invoke-static {v0, v1, v8, v2}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e1\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e8\u06e1\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    sget v9, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    const-string v1, "\u06e2\u06e8\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_6
    xor-int/lit8 v8, v10, -0x35

    const-string v1, "\u06e8\u06e5\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v4, v3, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e8\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v8, v10, 0x3ae

    const-string v1, "\u06e2\u06e8\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    aput-object v2, v5, v8

    const-string v1, "\u06e1\u06e3\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc45 -> :sswitch_2
        0xdc9c -> :sswitch_8
        0x1aa73d -> :sswitch_4
        0x1aaf02 -> :sswitch_7
        0x1ab35c -> :sswitch_3
        0x1ab362 -> :sswitch_6
        0x1ab649 -> :sswitch_0
        0x1ac265 -> :sswitch_a
        0x1ac90d -> :sswitch_5
        0x1ac90e -> :sswitch_1
        0x1ac985 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$20$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e5\u06e8\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v4, v3, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e1\u06e1\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v8, "\u06e6\u06e4\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e4\u06e5\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit8 v9, v11, 0x72

    const-string v1, "\u06e8\u06e8\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    aput-object v0, v5, v9

    const-string v1, "\u06df\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    sget v10, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    const-string v1, "\u06e6\u06e3\u06e7"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_5
    xor-int/lit8 v9, v11, -0x64

    const-string v1, "\u06e5\u06df\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v9, v11, -0x1c2

    const-string v1, "\u06e6\u06e2\u06df"

    move-object v8, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v8, "\u06e3\u06e8\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    sget v10, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    const-string v1, "\u06e2\u06e2\u06e1"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_9
    const/16 v1, 0x857

    const/16 v6, 0xbed

    invoke-static {v7, v1, v9, v6}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e7\u06e2\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    aput-object v6, v5, v9

    const-string v1, "\u06e6\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_b
    xor-int/lit8 v9, v11, -0x61

    const-string v1, "\u06e0\u06e0\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_c
    const/16 v0, 0x85c

    const/16 v1, 0x5d8

    invoke-static {v7, v0, v9, v1}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e5\u06e8\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_d
    sget v10, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    const-string v1, "\u06e5\u06df\u06e6"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e0\u06e6\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_f
    sget v10, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    const-string v1, "\u06e7\u06e1\u06e7"

    move-object v8, v1

    move v11, v10

    goto/16 :goto_0

    :sswitch_10
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e6\u06df\u06e5"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_11
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_d
        0x1aaae1 -> :sswitch_c
        0x1aaba2 -> :sswitch_8
        0x1aaec3 -> :sswitch_11
        0x1ab2a1 -> :sswitch_b
        0x1ab71d -> :sswitch_1
        0x1aba87 -> :sswitch_f
        0x1abd88 -> :sswitch_3
        0x1abd8c -> :sswitch_5
        0x1abe9f -> :sswitch_0
        0x1abea5 -> :sswitch_10
        0x1ac14c -> :sswitch_4
        0x1ac1a3 -> :sswitch_9
        0x1ac1ca -> :sswitch_2
        0x1ac1e2 -> :sswitch_7
        0x1ac54d -> :sswitch_6
        0x1ac566 -> :sswitch_e
        0x1ac9e3 -> :sswitch_a
    .end sparse-switch
.end method

.method synthetic lambda$21$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e6\u06e6\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object v5

    :sswitch_0
    sget v9, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06df\u06e5\u06e6"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e8\u06e7\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x866

    const/16 v4, 0xc4b

    invoke-static {v6, v1, v8, v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e3\u06e2\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit8 v8, v10, -0x50

    const-string v1, "\u06e3\u06e5\u06e5"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    aput-object v3, v0, v8

    const-string v1, "\u06df\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    sget v9, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    const-string v1, "\u06e4\u06e4\u06e0"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_6
    const/16 v1, 0x861

    const/16 v3, 0x817

    invoke-static {v6, v1, v8, v3}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e8\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e4\u06e8\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u06e7\u06e7\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v8, v10, 0x17c

    const-string v1, "\u06e4\u06e0\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v8, v10, 0x30c

    const-string v1, "\u06e0\u06e1\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e1\u06e7\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_c
    sget v9, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    const-string v1, "\u06e4\u06e1\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_d
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e2\u06e8\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_e
    sget v9, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    const-string v1, "\u06e3\u06e0"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_f
    xor-int/lit16 v8, v10, -0x16b

    const-string v1, "\u06e5\u06df\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_10
    aput-object v4, v0, v8

    const-string v1, "\u06e8\u06e8\u06e0"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdc5d -> :sswitch_f
        0x1aa7c0 -> :sswitch_a
        0x1aab07 -> :sswitch_10
        0x1ab35f -> :sswitch_1
        0x1ab663 -> :sswitch_8
        0x1ab6c3 -> :sswitch_6
        0x1ab9ea -> :sswitch_2
        0x1aba08 -> :sswitch_3
        0x1aba60 -> :sswitch_9
        0x1abae2 -> :sswitch_5
        0x1abd8d -> :sswitch_4
        0x1ac226 -> :sswitch_d
        0x1ac606 -> :sswitch_e
        0x1ac9c1 -> :sswitch_c
        0x1ac9e0 -> :sswitch_b
        0x1ac9e3 -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic lambda$22$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e3\u06e8\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    const-string v1, "\u06e0\u06e3\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0x86b

    const/16 v2, 0x3a8

    invoke-static {v4, v1, v9, v2}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06e8\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v8, v7, -0x255

    const-string v1, "\u06e0\u06e7\u06e1"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v8, v7, -0x16b

    const-string v1, "\u06e1\u06e5\u06e6"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v6, "\u06e0\u06e4\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    aput-object v2, v3, v9

    const-string v1, "\u06e3\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    sget v7, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    const-string v1, "\u06e7\u06e2\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    sget v7, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    const-string v1, "\u06df\u06e8\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v6, "\u06e3\u06e8\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_9
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0xdc60 -> :sswitch_1
        0xdc7e -> :sswitch_8
        0x1aa818 -> :sswitch_3
        0x1aab3f -> :sswitch_4
        0x1aab63 -> :sswitch_6
        0x1aabba -> :sswitch_0
        0x1aaf42 -> :sswitch_5
        0x1ab720 -> :sswitch_7
        0x1abadd -> :sswitch_9
        0x1ac568 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic lambda$23$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e1\u06e1\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v10, v9, 0x283

    const-string v1, "\u06e1\u06e1\u06e6"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_0
    sget v9, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    const-string v1, "\u06e2\u06e0"

    move-object v8, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e0\u06e8\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    sget v9, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v1, "\u06e3\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v10, v9, 0x266

    const-string v1, "\u06e0\u06e7\u06e3"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_4
    aput-object v2, v5, v11

    const-string v1, "\u06e8\u06e4\u06df"

    move-object v8, v1

    goto :goto_0

    :sswitch_5
    aput-object v3, v5, v11

    const-string v1, "\u06df\u06e0\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    sget v9, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    const-string v1, "\u06e2\u06e1\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_7
    const/16 v1, 0x87f

    const/16 v2, 0x7e1

    invoke-static {v7, v1, v11, v2}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e2\u06df\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v8, "\u06e6\u06e8\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v6, v0, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e1\u06df\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    const/16 v1, 0x878

    const/16 v3, 0xbf3

    invoke-static {v7, v1, v11, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e6\u06e2\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06df\u06e7\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_c
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e8\u06e0\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_d
    xor-int/lit16 v10, v9, 0xd5

    const-string v1, "\u06e5\u06e3\u06e8"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_e
    xor-int/lit16 v10, v9, 0x174

    const-string v1, "\u06df\u06e7"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_f
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "\u06e0\u06e5\u06e1"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_10
    sget v9, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    const-string v1, "\u06e1\u06e8\u06e3"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_11
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_5
        0xdc3e -> :sswitch_d
        0x1aa725 -> :sswitch_10
        0x1aa7f8 -> :sswitch_0
        0x1aab7c -> :sswitch_1
        0x1aabbc -> :sswitch_4
        0x1aabdc -> :sswitch_2
        0x1aae88 -> :sswitch_11
        0x1aaec3 -> :sswitch_8
        0x1aaec6 -> :sswitch_a
        0x1aaf9c -> :sswitch_3
        0x1ab247 -> :sswitch_c
        0x1ab284 -> :sswitch_e
        0x1abe0a -> :sswitch_7
        0x1ac1a6 -> :sswitch_b
        0x1ac265 -> :sswitch_f
        0x1ac8f0 -> :sswitch_6
        0x1ac963 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$24$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v11, 0x0

    const/4 v1, 0x0

    const-string v9, "\u06e6\u06e2\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move v10, v11

    move v12, v11

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v11, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const-string v1, "\u06e8\u06e4\u06e1"

    move-object v9, v1

    move v12, v11

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v10, v12, 0x207

    const-string v1, "\u06e8\u06df\u06df"

    move-object v9, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v9, "\u06e1\u06df\u06df"

    move-object v8, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v3, v6, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e2\u06e5\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    sget v11, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    const-string v1, "\u06e5\u06e1\u06e0"

    move-object v9, v1

    move v12, v11

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x895

    const/16 v4, 0x602

    invoke-static {v8, v1, v10, v4}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06df\u06e4\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    sget v11, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    const-string v1, "\u06e1\u06e7"

    move-object v9, v1

    move v12, v11

    goto :goto_0

    :sswitch_6
    aput-object v5, v0, v10

    const-string v1, "\u06e8\u06e5\u06e7"

    move-object v9, v1

    goto :goto_0

    :sswitch_7
    aput-object v4, v0, v10

    const-string v1, "\u06e3\u06e8\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_8
    sget v11, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const-string v1, "\u06e5\u06e4\u06e0"

    move-object v9, v1

    move v12, v11

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v9, "\u06e6\u06e1\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_a
    sget v11, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    const-string v1, "\u06e1\u06e4\u06df"

    move-object v9, v1

    move v12, v11

    goto :goto_0

    :sswitch_b
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u06e3\u06e0\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit16 v10, v12, 0x2fe

    const-string v1, "\u06e7\u06e6\u06e8"

    move-object v9, v1

    goto :goto_0

    :sswitch_d
    xor-int/lit8 v10, v12, 0x12

    const-string v1, "\u06e6\u06df\u06e5"

    move-object v9, v1

    goto :goto_0

    :sswitch_e
    const/16 v1, 0x89e

    const/16 v5, 0xa63

    invoke-static {v8, v1, v10, v5}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e0\u06df\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_f
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v9, "\u06e2\u06e8\u06e3"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_10
    xor-int/lit8 v10, v12, -0x66

    const-string v1, "\u06e5\u06e6\u06e7"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v9, "\u06df\u06e1\u06e1"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_12
    aput-object v7, v0, v10

    const-string v1, "\u06e7\u06e3\u06e7"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v9, "\u06e4\u06e7\u06e5"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_14
    sget v11, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    const-string v1, "\u06e2\u06e7\u06e6"

    move-object v9, v1

    move v12, v11

    goto/16 :goto_0

    :sswitch_15
    xor-int/lit16 v10, v12, -0x1ab

    const-string v1, "\u06e1\u06e7\u06e0"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_16
    const/16 v1, 0x8a3

    const/16 v7, 0x87b

    invoke-static {v8, v1, v10, v7}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e4\u06e7\u06e4"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_17
    xor-int/lit16 v10, v12, -0x321

    const-string v1, "\u06e5\u06e3\u06e7"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_18
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdc26 -> :sswitch_10
        0x1aa73f -> :sswitch_f
        0x1aa7a2 -> :sswitch_13
        0x1aaac3 -> :sswitch_9
        0x1aae81 -> :sswitch_a
        0x1aaf1c -> :sswitch_0
        0x1aaf7a -> :sswitch_e
        0x1ab304 -> :sswitch_18
        0x1ab341 -> :sswitch_c
        0x1ab35d -> :sswitch_1
        0x1ab623 -> :sswitch_14
        0x1abac1 -> :sswitch_b
        0x1abac2 -> :sswitch_8
        0x1abdc4 -> :sswitch_d
        0x1abe09 -> :sswitch_6
        0x1abe21 -> :sswitch_15
        0x1abe66 -> :sswitch_16
        0x1ac14c -> :sswitch_7
        0x1ac189 -> :sswitch_5
        0x1ac1ab -> :sswitch_11
        0x1ac58b -> :sswitch_3
        0x1ac5e9 -> :sswitch_12
        0x1ac8c8 -> :sswitch_4
        0x1ac965 -> :sswitch_17
        0x1ac98a -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic lambda$25$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06df\u06e7\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v8, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    const-string v1, "\u06e0\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u06e6\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v9, v8, -0xe3

    const-string v1, "\u06df\u06e7\u06e6"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_2
    sget v8, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    const-string v1, "\u06e2\u06df\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    aput-object v4, v0, v10

    const-string v1, "\u06e0\u06e7\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v2, v6, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e7\u06e0\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e2\u06e2\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_6
    const/16 v1, 0x8ae

    const/16 v4, 0x492

    invoke-static {v3, v1, v10, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e7\u06e0\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e8\u06e2\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e0\u06e7\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit8 v9, v8, -0x56

    const-string v1, "\u06e6\u06e5\u06e1"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_a
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc03 -> :sswitch_1
        0x1aa7fd -> :sswitch_5
        0x1aa7fe -> :sswitch_3
        0x1aabbe -> :sswitch_2
        0x1aabbf -> :sswitch_4
        0x1ab244 -> :sswitch_9
        0x1ab2a7 -> :sswitch_7
        0x1ac202 -> :sswitch_6
        0x1ac529 -> :sswitch_0
        0x1ac52d -> :sswitch_a
        0x1ac927 -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$26$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v2, 0x1

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۤۧۥ()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x8cd

    sget v7, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v7, v7, 0x393

    const/16 v8, 0x88b

    invoke-static {v5, v6, v7, v8}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x8f7

    sget v7, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v7, v7, 0x2e7

    const/16 v8, 0x1f6

    invoke-static {v5, v6, v7, v8}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۧۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v1, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۤۤۧ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :sswitch_0
    invoke-static {v4}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x0

    :goto_1
    return-object v0

    :sswitch_4
    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v5

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-nez v5, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_7
    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    const v0, 0xbe22

    goto :goto_3

    :sswitch_9
    const/4 v1, 0x0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۟(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟ۢۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :sswitch_a
    invoke-static {v5}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v6

    const v0, 0xbe7f

    :goto_4
    const v7, 0xbe90

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    if-nez v6, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    const v0, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :sswitch_e
    move v0, v1

    :goto_6
    const v1, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :cond_3
    :sswitch_f
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_10
    const v0, 0xbf1a

    goto :goto_5

    :sswitch_11
    invoke-static {v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۢ۠۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0x910

    const/16 v8, 0xc02

    invoke-static {v6, v7, v2, v8}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v0, 0xc202

    :goto_8
    const v7, 0xc213

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :sswitch_12
    if-eqz v6, :cond_4

    const v0, 0xc25f

    goto :goto_8

    :cond_4
    :sswitch_13
    const v0, 0xc240

    goto :goto_8

    :sswitch_14
    move v0, v2

    goto :goto_6

    :sswitch_15
    if-eqz v0, :cond_3

    const v1, 0xc2db

    goto :goto_7

    :sswitch_16
    move-object v0, v3

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb97b -> :sswitch_0
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_11
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x1f7 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x12 -> :sswitch_f
        0x33 -> :sswitch_0
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_14
        0x53 -> :sswitch_a
    .end sparse-switch
.end method

.method synthetic lambda$27$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v4, 0x0

    const/4 v3, 0x1

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x911

    sget v7, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v7, v7, 0x2ca

    const/16 v8, 0x816

    invoke-static {v5, v6, v7, v8}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, v4

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۥۢ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :sswitch_4
    invoke-static {v5}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    move-object v0, v4

    goto :goto_1

    :sswitch_8
    invoke-static {v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۡۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v6

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    const/4 v1, 0x3

    if-ne v6, v1, :cond_2

    const v1, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_a
    const v1, 0xbe41

    goto :goto_3

    :sswitch_b
    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget v6, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v6, v6, -0x10b

    invoke-static {v2, v6}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v7

    const/16 v8, 0x96a

    sget v9, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v9, v9, 0x209

    const/16 v10, 0xb4d

    invoke-static {v7, v8, v9, v10}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v1, 0xbe7f

    :goto_4
    const v8, 0xbe90

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v1, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eqz v7, :cond_3

    const v1, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v7, 0x971

    sget v8, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v8, v8, 0x170

    const/16 v9, 0x279

    invoke-static {v1, v7, v8, v9}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xbefb

    :goto_5
    const v7, 0xbf0c

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_f
    const v1, 0xbf39

    goto :goto_5

    :sswitch_10
    if-eqz v2, :cond_4

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_11
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v2, 0x97a

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v7, v7, 0x289

    const/16 v8, 0xa14

    invoke-static {v1, v2, v7, v8}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_12
    if-eqz v2, :cond_5

    const v1, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_13
    const v1, 0xc240

    goto :goto_6

    :sswitch_14
    const v1, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_15
    move v1, v3

    :goto_8
    const v2, 0xc2fa

    :goto_9
    const v6, 0xc30b

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_7

    goto :goto_9

    :sswitch_16
    if-eqz v1, :cond_6

    const v2, 0xc5e2

    goto :goto_9

    :sswitch_17
    const v1, 0xc29d

    goto :goto_7

    :sswitch_18
    const/4 v1, 0x0

    goto :goto_8

    :cond_6
    :sswitch_19
    const v2, 0xc5c3

    goto :goto_9

    :sswitch_1a
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_4
        0xb939 -> :sswitch_b
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_18
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x35 -> :sswitch_18
        0x1f7 -> :sswitch_10
        0x7eef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_14
        0x53 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_15
        0xf1 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_4
        0x6e9 -> :sswitch_1a
    .end sparse-switch
.end method

.method synthetic lambda$28$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x97e

    sget v7, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v7, v7, -0x1a9

    const/16 v8, 0xc4c

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x985

    sget v7, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v7, v7, 0x297

    const/16 v8, 0xb80

    invoke-static {v5, v6, v7, v8}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x989

    const/16 v7, 0x6f7

    invoke-static {v5, v6, v4, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x98a

    const/16 v7, 0xad8

    invoke-static {v5, v6, v4, v7}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v1, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۤۤۧ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v6

    :sswitch_0
    invoke-static {v6}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x0

    :goto_1
    return-object v0

    :sswitch_4
    invoke-static {v6}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-nez v3, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_7
    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    const v0, 0xbe22

    goto :goto_3

    :sswitch_9
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۥۢ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v7

    move v1, v2

    move v3, v2

    :goto_4
    invoke-static {v7}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v8

    const v0, 0xbe7f

    :goto_5
    const v9, 0xbe90

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_3

    goto :goto_5

    :cond_2
    :sswitch_a
    const v0, 0xbebd

    goto :goto_5

    :sswitch_b
    if-nez v8, :cond_2

    const v0, 0xbedc

    goto :goto_5

    :sswitch_c
    const v0, 0xbefb

    :goto_6
    const v7, 0xbf0c

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :cond_3
    :sswitch_d
    const v0, 0xbf39

    goto :goto_6

    :sswitch_e
    const/4 v0, 0x3

    if-ne v1, v0, :cond_3

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_f
    const v0, 0xc202

    :goto_7
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_10
    if-nez v3, :cond_4

    const v0, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_7

    :sswitch_12
    move-object v0, v5

    goto :goto_1

    :sswitch_13
    invoke-static {v7}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v8

    const/16 v9, 0x98b

    sget v10, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v10, v10, 0x7a

    const/16 v11, 0x221

    invoke-static {v8, v9, v10, v11}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const v0, 0xc27e

    :goto_8
    const v9, 0xc28f

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_5
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_15
    if-eqz v8, :cond_5

    const v0, 0xc2db

    goto :goto_8

    :sswitch_16
    const v0, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_17
    const v0, 0xc5a4

    goto :goto_9

    :sswitch_18
    move v3, v4

    goto/16 :goto_4

    :sswitch_19
    sget v0, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v0, v0, 0x31e

    add-int/2addr v0, v1

    const v1, 0xc601

    :goto_a
    const v8, 0xc612

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_1a
    const v1, 0xc620

    goto :goto_a

    :sswitch_1b
    move v1, v0

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb97b -> :sswitch_0
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_13
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_0
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_19
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_1b
    .end sparse-switch
.end method

.method synthetic lambda$29$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e8\u06e2\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0x9b2

    const/16 v3, 0xb7b

    invoke-static {v6, v1, v8, v3}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e1\u06e8\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0x993

    const/16 v2, 0x37f

    invoke-static {v6, v1, v8, v2}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06df\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    sget v9, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    const-string v1, "\u06e5\u06e5\u06e7"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_2
    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e3\u06df\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e7\u06e1\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e3\u06e8\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    aput-object v2, v5, v8

    const-string v1, "\u06e7\u06df\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    sget v9, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    const-string v1, "\u06e3\u06e0\u06e1"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_7
    sget v9, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    const-string v1, "\u06e0\u06e2\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_8
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e0\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v8, v10, -0x1f9

    const-string v1, "\u06df\u06e6\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v8, v10, 0x292

    const-string v1, "\u06e1\u06e5\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e7\u06e4\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit8 v8, v10, 0x66

    const-string v1, "\u06e3\u06e6\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_d
    xor-int/lit16 v8, v10, 0x322

    const-string v1, "\u06e6\u06e5\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_e
    aput-object v3, v5, v8

    const-string v1, "\u06e6\u06e1\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_f
    sget v9, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    const-string v1, "\u06e6\u06e7\u06e5"

    move-object v7, v1

    move v10, v9

    goto/16 :goto_0

    :sswitch_10
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_f
        0x1aa704 -> :sswitch_b
        0x1aa7dc -> :sswitch_0
        0x1aab26 -> :sswitch_9
        0x1aaf44 -> :sswitch_e
        0x1aafa1 -> :sswitch_8
        0x1ab607 -> :sswitch_10
        0x1ab624 -> :sswitch_c
        0x1ab721 -> :sswitch_7
        0x1abe47 -> :sswitch_a
        0x1ac18b -> :sswitch_2
        0x1ac202 -> :sswitch_5
        0x1ac244 -> :sswitch_d
        0x1ac50a -> :sswitch_1
        0x1ac54e -> :sswitch_4
        0x1ac5a3 -> :sswitch_6
        0x1ac928 -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic lambda$3$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v11, 0x0

    const/4 v1, 0x0

    const-string v9, "\u06e1\u06e7\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move v10, v11

    move v12, v11

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0x9cf

    const/16 v6, 0x20e

    invoke-static {v8, v1, v12, v6}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e2\u06df\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0x9e6

    const/16 v2, 0x554

    invoke-static {v8, v1, v12, v2}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06df\u06e4\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    aput-object v0, v3, v12

    const-string v1, "\u06e0\u06e3\u06e3"

    move-object v9, v1

    goto :goto_0

    :sswitch_2
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v9, "\u06e5\u06e4\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    aput-object v2, v3, v12

    const-string v1, "\u06e2\u06e0\u06df"

    move-object v9, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v9, "\u06df\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_5
    sget v10, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    const-string v1, "\u06e3\u06e2\u06e1"

    move-object v9, v1

    goto :goto_0

    :sswitch_6
    sget v10, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    const-string v1, "\u06e4\u06e6\u06e3"

    move-object v9, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v9, "\u06e6\u06df\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v11, v10, 0x1ea

    const-string v1, "\u06e6\u06e8\u06df"

    move-object v9, v1

    move v12, v11

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v9, "\u06e1\u06e3\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v9, "\u06df\u06df\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_b
    aput-object v6, v3, v12

    const-string v1, "\u06e4\u06e0\u06e3"

    move-object v9, v1

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v9, "\u06e1\u06e4\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_d
    sget v10, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    const-string v1, "\u06e6\u06e6\u06e8"

    move-object v9, v1

    goto :goto_0

    :sswitch_e
    xor-int/lit16 v11, v10, -0x120

    const-string v1, "\u06e0\u06e8\u06e0"

    move-object v9, v1

    move v12, v11

    goto :goto_0

    :sswitch_f
    xor-int/lit8 v11, v10, -0x19

    const-string v1, "\u06df\u06e8\u06e2"

    move-object v9, v1

    move v12, v11

    goto/16 :goto_0

    :sswitch_10
    xor-int/lit16 v11, v10, 0x25a

    const-string v1, "\u06e8\u06e8\u06e2"

    move-object v9, v1

    move v12, v11

    goto/16 :goto_0

    :sswitch_11
    const/16 v0, 0x9c6

    const/16 v1, 0x9d8

    invoke-static {v8, v0, v12, v1}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06df\u06e5\u06e2"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_12
    sget v10, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    const-string v1, "\u06e4\u06e5\u06e8"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_13
    sget v10, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    const-string v1, "\u06e4\u06e3"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_14
    xor-int/lit16 v11, v10, 0x8e

    const-string v1, "\u06e1\u06e7\u06df"

    move-object v9, v1

    move v12, v11

    goto/16 :goto_0

    :sswitch_15
    invoke-static {v5, v7, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e4\u06e7\u06e8"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_16
    sget v10, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    const-string v1, "\u06e3\u06e0\u06e7"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_17
    xor-int/lit16 v11, v10, 0x20f

    const-string v1, "\u06df\u06e6\u06e0"

    move-object v9, v1

    move v12, v11

    goto/16 :goto_0

    :sswitch_18
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0xdbe6 -> :sswitch_d
        0xdc7f -> :sswitch_17
        0x1aa705 -> :sswitch_9
        0x1aa79f -> :sswitch_2
        0x1aa7bc -> :sswitch_c
        0x1aa7d9 -> :sswitch_1
        0x1aa819 -> :sswitch_0
        0x1aab40 -> :sswitch_6
        0x1aaf06 -> :sswitch_7
        0x1aaf25 -> :sswitch_16
        0x1aaf79 -> :sswitch_b
        0x1aaf7b -> :sswitch_a
        0x1ab24a -> :sswitch_4
        0x1ab261 -> :sswitch_13
        0x1ab62a -> :sswitch_e
        0x1ab662 -> :sswitch_10
        0x1ab9e7 -> :sswitch_15
        0x1aba87 -> :sswitch_8
        0x1abaa1 -> :sswitch_14
        0x1abac5 -> :sswitch_18
        0x1abe23 -> :sswitch_12
        0x1ac148 -> :sswitch_5
        0x1ac228 -> :sswitch_f
        0x1ac25d -> :sswitch_3
        0x1ac9e2 -> :sswitch_11
    .end sparse-switch
.end method

.method synthetic lambda$30$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e8\u06e6\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0xa10

    const/16 v4, 0x7cf

    invoke-static {v7, v1, v11, v4}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e4\u06e1\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    sget v9, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v1, "\u06e8\u06e3\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v10, v9, 0x252

    const-string v1, "\u06e8\u06e4\u06df"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v10, v9, -0x20c

    const-string v1, "\u06df\u06e3\u06df"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "\u06e5\u06e3\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    sget v9, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    const-string v1, "\u06e1\u06e8\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_5
    sget v9, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    const-string v1, "\u06e1\u06e7"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v8, "\u06e0\u06e6\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    aput-object v2, v6, v11

    const-string v1, "\u06e8\u06df\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e6\u06e2\u06e5"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    aput-object v4, v6, v11

    const-string v1, "\u06e5\u06e2\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_a
    sget v9, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    const-string v1, "\u06e5\u06e1\u06e0"

    move-object v8, v1

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v10, v9, 0x284

    const-string v1, "\u06e1\u06df\u06e0"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e2\u06e1\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_d
    const/16 v1, 0x9f1

    const/16 v2, 0x72d

    invoke-static {v7, v1, v11, v2}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e4\u06e0\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_e
    xor-int/lit16 v10, v9, 0x179

    const-string v1, "\u06e5\u06e0\u06e2"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_f
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e6\u06e8"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v5, v0, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e0\u06e1\u06e7"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_11
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdc26 -> :sswitch_2
        0xdcc2 -> :sswitch_0
        0x1aab06 -> :sswitch_11
        0x1aab9d -> :sswitch_3
        0x1aae82 -> :sswitch_7
        0x1aaf9e -> :sswitch_1
        0x1ab281 -> :sswitch_a
        0x1ab9e3 -> :sswitch_8
        0x1aba04 -> :sswitch_f
        0x1abda7 -> :sswitch_d
        0x1abdc4 -> :sswitch_e
        0x1abde4 -> :sswitch_10
        0x1abe07 -> :sswitch_c
        0x1ac1a9 -> :sswitch_5
        0x1ac8ca -> :sswitch_4
        0x1ac946 -> :sswitch_b
        0x1ac963 -> :sswitch_9
        0x1ac9a2 -> :sswitch_6
    .end sparse-switch
.end method

.method synthetic lambda$31$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e8\u06e3\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v9, v11, 0x267

    const-string v1, "\u06e3\u06df\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_0
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e7\u06df\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e3\u06e7\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    const/16 v0, 0xa24

    const/16 v1, 0x960

    invoke-static {v7, v0, v9, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e0\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    sget v10, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v1, "\u06e5\u06df\u06e3"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_4
    sget v10, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    const-string v1, "\u06e1\u06e3\u06e0"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_5
    sget v10, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    const-string v1, "\u06e5\u06e1\u06e0"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_6
    aput-object v5, v3, v9

    const-string v1, "\u06e8\u06e8\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v9, v11, 0x393

    const-string v1, "\u06e8\u06e2\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e6\u06e4\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v6, v4, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e6\u06e4\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v8, "\u06e7\u06e3\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    sget v10, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    const-string v1, "\u06e7\u06e3\u06e3"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_c
    const/16 v1, 0xa35

    const/16 v5, 0x499

    invoke-static {v7, v1, v9, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e0\u06e7\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_d
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v8, "\u06e1\u06e3\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_e
    xor-int/lit16 v9, v11, 0x169

    const-string v1, "\u06e0\u06e2\u06e3"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_f
    aput-object v0, v3, v9

    const-string v1, "\u06e5\u06e4\u06e7"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_10
    xor-int/lit16 v9, v11, -0x1e7

    const-string v1, "\u06e1\u06e0\u06e7"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_11
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab21 -> :sswitch_c
        0x1aabbf -> :sswitch_0
        0x1aaea8 -> :sswitch_6
        0x1aaf03 -> :sswitch_a
        0x1ab26a -> :sswitch_1
        0x1ab607 -> :sswitch_f
        0x1ab700 -> :sswitch_b
        0x1abd89 -> :sswitch_7
        0x1abdc4 -> :sswitch_10
        0x1abe28 -> :sswitch_5
        0x1ac1e3 -> :sswitch_11
        0x1ac1e8 -> :sswitch_3
        0x1ac508 -> :sswitch_4
        0x1ac587 -> :sswitch_e
        0x1ac58c -> :sswitch_8
        0x1ac92b -> :sswitch_2
        0x1ac947 -> :sswitch_d
        0x1ac9e2 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$32$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e6\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v0

    const-string v1, "\u06e7\u06e4\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06df\u06e8\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v8, v10, 0x35b

    const-string v1, "\u06e4\u06e5\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v8, v10, -0x1cb

    const-string v1, "\u06e8\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v2, v3, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e0\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0xa44

    const/16 v4, 0xc90

    invoke-static {v0, v1, v8, v4}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e0\u06e1\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    sget v9, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    const-string v1, "\u06e1\u06e6\u06e1"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e6\u06e8\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    aput-object v4, v5, v8

    const-string v1, "\u06e5\u06e6\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    sget v9, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    const-string v1, "\u06df\u06df\u06e2"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_9
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e1\u06e6\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcba -> :sswitch_6
        0xdcf9 -> :sswitch_4
        0x1aa702 -> :sswitch_2
        0x1aa727 -> :sswitch_a
        0x1aab05 -> :sswitch_9
        0x1aaf5c -> :sswitch_1
        0x1aaf63 -> :sswitch_5
        0x1aba80 -> :sswitch_7
        0x1abe62 -> :sswitch_3
        0x1ac25f -> :sswitch_0
        0x1ac5a4 -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$33$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e1\u06e5\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v6, "\u06e2\u06e7\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v8, v7, 0x30d

    const-string v1, "\u06df\u06e7\u06e4"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_1
    sget v7, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06e1\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    sget v7, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    const-string v1, "\u06e2\u06e5\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    aput-object v3, v0, v9

    const-string v1, "\u06e2\u06e2\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v6, "\u06e1\u06e1\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit8 v8, v7, -0x15

    const-string v1, "\u06e3\u06e4\u06e1"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_6
    const/16 v1, 0xa65

    const/16 v3, 0xacb

    invoke-static {v5, v1, v9, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e1\u06e1\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u06df\u06e6\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e6\u06e0\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0xdc22 -> :sswitch_0
        0x1aa7d9 -> :sswitch_1
        0x1aa7fc -> :sswitch_3
        0x1aaec1 -> :sswitch_7
        0x1aaf3d -> :sswitch_4
        0x1ab2a5 -> :sswitch_8
        0x1ab300 -> :sswitch_5
        0x1ab33f -> :sswitch_2
        0x1ab6a0 -> :sswitch_6
        0x1ac166 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$34$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06df\u06e5\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v4, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e7\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e3\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    const/16 v1, 0xa94

    const/16 v2, 0x9bc

    invoke-static {v6, v1, v10, v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e7\u06e4\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    aput-object v2, v3, v10

    const-string v1, "\u06e0\u06e6\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    sget v8, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    const-string v1, "\u06e6\u06e0\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    const/16 v0, 0xa86

    const/16 v1, 0xc97

    invoke-static {v6, v0, v10, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e6\u06e5"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    sget v8, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    const-string v1, "\u06e6\u06e4\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e3\u06df\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v9, v8, -0x262

    const-string v1, "\u06df\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e5\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e3\u06e7\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_a
    xor-int/lit8 v9, v8, -0x36

    const-string v1, "\u06e4\u06e3\u06e4"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_b
    sget v8, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    const-string v1, "\u06e8\u06e5\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit16 v9, v8, 0xc2

    const-string v1, "\u06e0\u06e6\u06e1"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_d
    xor-int/lit16 v9, v8, 0x304

    const-string v1, "\u06e0\u06e4\u06df"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_e
    sget v8, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    const-string v1, "\u06e2\u06e1\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_f
    aput-object v0, v3, v10

    const-string v1, "\u06e4\u06e0\u06e3"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_10
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0xdbe6 -> :sswitch_4
        0xdc5d -> :sswitch_8
        0xdca3 -> :sswitch_3
        0x1aa7bb -> :sswitch_0
        0x1aab5b -> :sswitch_1
        0x1aab9b -> :sswitch_2
        0x1ab287 -> :sswitch_a
        0x1ab321 -> :sswitch_6
        0x1ab60b -> :sswitch_5
        0x1ab704 -> :sswitch_e
        0x1ab9e7 -> :sswitch_b
        0x1aba45 -> :sswitch_f
        0x1ac166 -> :sswitch_7
        0x1ac1e4 -> :sswitch_d
        0x1ac242 -> :sswitch_10
        0x1ac5a7 -> :sswitch_9
        0x1ac987 -> :sswitch_c
    .end sparse-switch
.end method

.method synthetic lambda$35$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xaba

    sget v6, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v6, v6, -0x5f

    const/16 v7, 0x326

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۠ۦ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v1, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۥۢ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_8
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    move-object v0, v2

    :goto_4
    return-object v0

    :sswitch_c
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۢۨۦ(Ljava/lang/Object;)I

    move-result v4

    const v1, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v1, 0xbf39

    goto :goto_5

    :sswitch_e
    const/4 v1, 0x1

    if-ne v4, v1, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤ۟ۤ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xaf6

    sget v6, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v6, v6, -0x1f7

    const/16 v7, 0x9a5

    invoke-static {v4, v5, v6, v7}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v4, :cond_4

    const v1, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v1, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v4, 0xb07

    sget v5, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v5, v5, 0x263

    const/16 v6, 0x249

    invoke-static {v1, v4, v5, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_13
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-eqz v4, :cond_5

    const v1, 0xc2db

    goto :goto_7

    :sswitch_15
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    :sswitch_16
    move-object v0, v2

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_16
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_16
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_8
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch
.end method

.method synthetic lambda$36$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v3, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xb0b

    sget v6, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v6, v6, 0x2dd

    const/16 v7, 0x223

    invoke-static {v4, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, v3

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۥۢ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :sswitch_4
    invoke-static {v4}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    move-object v0, v3

    goto :goto_1

    :sswitch_8
    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۥۨ(Ljava/lang/Object;)I

    move-result v2

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    const/4 v0, 0x3

    if-ne v2, v0, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbe41

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v0

    const/16 v2, 0xb59

    sget v5, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v5, v5, 0x15b

    const/16 v6, 0x90c

    invoke-static {v0, v2, v5, v6}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eqz v2, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_e
    const/4 v2, 0x0

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۤۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :sswitch_f
    invoke-static {v5}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v6

    const v0, 0xbefb

    :goto_5
    const v7, 0xbf0c

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v0, 0xbf39

    goto :goto_5

    :sswitch_11
    if-nez v6, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_12
    const v0, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_13
    const v0, 0xc221

    goto :goto_6

    :sswitch_14
    move v0, v2

    :goto_7
    const v2, 0xc2fa

    :goto_8
    const v5, 0xc30b

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_6

    goto :goto_8

    :sswitch_15
    if-nez v0, :cond_6

    const v2, 0xc5e2

    goto :goto_8

    :sswitch_16
    invoke-static {v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0xb5d

    sget v8, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v8, v8, -0x122

    const/16 v9, 0xaf7

    invoke-static {v6, v7, v8, v9}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v0, 0xc27e

    :goto_9
    const v7, 0xc28f

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :cond_5
    :sswitch_17
    const v0, 0xc2bc

    goto :goto_9

    :sswitch_18
    if-eqz v6, :cond_5

    const v0, 0xc2db

    goto :goto_9

    :sswitch_19
    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    :sswitch_1a
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_1b
    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_4
        0xb939 -> :sswitch_b
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_4
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_16
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_1a
        0x6c8 -> :sswitch_4
        0x6e9 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_17
        0x33 -> :sswitch_f
        0x54 -> :sswitch_19
        0xf1 -> :sswitch_18
    .end sparse-switch
.end method

.method synthetic lambda$37$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xb86

    sget v6, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v6, v6, -0x252

    const/16 v7, 0x53f

    invoke-static {v4, v5, v6, v7}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v1, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۥۢ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_8
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    move-object v0, v2

    :goto_4
    return-object v0

    :sswitch_c
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۢۨۦ(Ljava/lang/Object;)I

    move-result v4

    const v1, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v1, 0xbf39

    goto :goto_5

    :sswitch_e
    const/4 v1, 0x1

    if-ne v4, v1, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤ۟ۤ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xbc4

    sget v6, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v6, v6, 0x292

    const/16 v7, 0x7ff

    invoke-static {v4, v5, v6, v7}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v5, :cond_4

    const v1, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v1, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_13
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-eqz v4, :cond_5

    const v1, 0xc2db

    goto :goto_7

    :sswitch_15
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :sswitch_16
    move-object v0, v2

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_16
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_16
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_8
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch
.end method

.method synthetic lambda$38$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v9, 0xc03

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0xbda

    sget v5, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v5, v5, 0x2ba

    const/16 v6, 0x682

    invoke-static {v3, v4, v5, v6}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۟(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟ۢۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_8
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v0

    sget v1, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v1, v1, 0x260

    const/16 v2, 0x6f8

    invoke-static {v0, v9, v1, v2}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_4
    return-object v0

    :sswitch_c
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۨ۟۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :sswitch_d
    invoke-static {v4}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_e
    const v1, 0xbf39

    goto :goto_5

    :sswitch_f
    if-nez v2, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_10
    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    const v0, 0xc221

    goto :goto_6

    :sswitch_12
    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/luckypray/dexkit/result/AnnotationData;

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۡۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xc0a

    sget v7, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v7, v7, -0x1e

    const/16 v8, 0x53b

    invoke-static {v5, v6, v7, v8}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xc27e

    :goto_7
    const v6, 0xc28f

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_13
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-eqz v5, :cond_4

    const v2, 0xc2db

    goto :goto_7

    :sswitch_15
    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۤۥۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v5, 0xc18

    sget v6, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v6, v6, -0x3cb

    const/16 v7, 0x55d

    invoke-static {v1, v5, v6, v7}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v1, 0xc2fa

    :goto_8
    const v7, 0xc30b

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    if-eqz v6, :cond_5

    const v1, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_17
    const v1, 0xc5c3

    goto :goto_8

    :sswitch_18
    invoke-static {v2, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xc601

    :goto_9
    const v6, 0xc612

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_19
    if-eqz v5, :cond_6

    const v1, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_1a
    const v1, 0xc63f

    goto :goto_9

    :sswitch_1b
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v5, 0xc21

    sget v6, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v6, v6, -0x26d

    invoke-static {v1, v5, v6, v9}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xc67d

    :goto_a
    const v6, 0xc68e

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :cond_7
    :sswitch_1c
    const v1, 0xc6bb

    goto :goto_a

    :sswitch_1d
    if-nez v5, :cond_7

    const v1, 0xc965

    goto :goto_a

    :sswitch_1e
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v5, 0xc24

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v6, v6, -0x62

    const/16 v7, 0x9bd

    invoke-static {v1, v5, v6, v7}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xc984

    :goto_b
    const v6, 0xc995

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_a

    goto :goto_b

    :sswitch_1f
    if-nez v5, :cond_8

    const v1, 0xc9e1

    goto :goto_b

    :cond_8
    :sswitch_20
    const v1, 0xc9c2

    goto :goto_b

    :sswitch_21
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v5, 0xc28

    sget v6, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v6, v6, -0xe6

    const/16 v7, 0x5a9

    invoke-static {v1, v5, v6, v7}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xca00

    :goto_c
    const v6, 0xca11

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_b

    goto :goto_c

    :cond_9
    :sswitch_22
    const v1, 0xca3e

    goto :goto_c

    :sswitch_23
    if-nez v5, :cond_9

    const v1, 0xca5d

    goto :goto_c

    :sswitch_24
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v5, 0xc2f

    sget v6, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v6, v6, -0x170

    const/16 v7, 0x225

    invoke-static {v1, v5, v6, v7}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xca7c

    :goto_d
    const v6, 0xca8d

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_c

    goto :goto_d

    :sswitch_25
    if-nez v5, :cond_a

    const v1, 0xcd64

    goto :goto_d

    :cond_a
    :sswitch_26
    const v1, 0xcd45

    goto :goto_d

    :sswitch_27
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v2, 0xc34

    sget v5, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v5, v5, 0xe6

    const/16 v6, 0x465

    invoke-static {v1, v2, v5, v6}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xcd83

    :goto_e
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_e

    :sswitch_28
    const v1, 0xcda2

    goto :goto_e

    :sswitch_29
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v5, 0xc49

    sget v6, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v6, v6, -0x1e7

    const/16 v7, 0x2f2

    invoke-static {v1, v5, v6, v7}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xcdff

    :goto_f
    const v6, 0xce10

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_e

    goto :goto_f

    :cond_b
    :sswitch_2a
    const v1, 0xce3d

    goto :goto_f

    :sswitch_2b
    if-eqz v5, :cond_b

    const v1, 0xd0e7

    goto :goto_f

    :sswitch_2c
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v2, 0xc56

    sget v5, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v5, v5, 0x3b9

    const/16 v6, 0xbe9

    invoke-static {v1, v2, v5, v6}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xd106

    :goto_10
    const v2, 0xd117

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_f

    goto :goto_10

    :sswitch_2d
    const v1, 0xd125

    goto :goto_10

    :sswitch_2e
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v5, 0xc6f

    sget v6, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v6, v6, 0x102

    const/16 v7, 0x2ac

    invoke-static {v1, v5, v6, v7}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xd182

    :goto_11
    const v6, 0xd193

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_10

    goto :goto_11

    :sswitch_2f
    if-eqz v5, :cond_c

    const v1, 0xd1df

    goto :goto_11

    :cond_c
    :sswitch_30
    const v1, 0xd1c0

    goto :goto_11

    :sswitch_31
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v2, 0xc7d

    sget v5, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v5, v5, -0x1fe

    const/16 v6, 0x4cd

    invoke-static {v1, v2, v5, v6}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xd1fe

    :goto_12
    const v2, 0xd20f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_11

    goto :goto_12

    :sswitch_32
    const v1, 0xd4a8

    goto :goto_12

    :sswitch_33
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v5, 0xc97

    sget v6, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v6, v6, 0x333

    const/16 v7, 0x4e1

    invoke-static {v1, v5, v6, v7}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xd505

    :goto_13
    const v5, 0xd516

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_12

    goto :goto_13

    :sswitch_34
    if-eqz v2, :cond_d

    const v1, 0xd562

    goto :goto_13

    :cond_d
    :sswitch_35
    const v1, 0xd543

    goto :goto_13

    :sswitch_36
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v2, 0xca8

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0xf

    const/16 v6, 0x85e

    invoke-static {v1, v2, v5, v6}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xd581

    :goto_14
    const v2, 0xd592

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_13

    goto :goto_14

    :sswitch_37
    const v1, 0xd5a0

    goto :goto_14

    :sswitch_38
    const v1, 0xd888

    :goto_15
    const v2, 0xd899

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_14

    goto :goto_15

    :sswitch_39
    const v1, 0xd8a7

    goto :goto_15

    :sswitch_3a
    const/4 v0, 0x0

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_d
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_d
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_29
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_29
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_29
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_29
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_29
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_2e
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_30
        0x4c -> :sswitch_31
        0x53 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_32
        0x6a7 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_34
        0x32 -> :sswitch_35
        0x55 -> :sswitch_38
        0x74 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_39
        0x3e -> :sswitch_d
    .end sparse-switch
.end method

.method synthetic lambda$39$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xcc5

    sget v6, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v6, v6, 0x27a

    const/16 v7, 0x671

    invoke-static {v4, v5, v6, v7}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۤۧۥ()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xcee

    sget v7, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v7, v7, 0x175

    const/16 v8, 0x26d

    invoke-static {v5, v6, v7, v8}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xd18

    sget v7, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v7, v7, 0x353

    const/16 v8, 0x75d

    invoke-static {v5, v6, v7, v8}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۧۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v2, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v0, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    return-object v0

    :sswitch_b
    move-object v0, v1

    goto :goto_4

    :sswitch_c
    move-object v0, v1

    goto :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_c
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$4$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e6\u06e0\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v10, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    const-string v1, "\u06e2\u06e1\u06e2"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v9, v11, 0x178

    const-string v1, "\u06e6\u06e3\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit8 v9, v11, -0x7b

    const-string v1, "\u06e0\u06e7\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_2
    aput-object v0, v2, v9

    const-string v1, "\u06e7\u06df\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    sget v10, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    const-string v1, "\u06e1\u06e7\u06e3"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_4
    xor-int/lit8 v9, v11, -0x74

    const-string v1, "\u06e8\u06e4\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_5
    sget v10, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    const-string v1, "\u06df\u06e7\u06e0"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v8, "\u06e5\u06df\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v9, v11, 0x339

    const-string v1, "\u06e0\u06e1\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    const/16 v0, 0xd20

    const/16 v1, 0x37e

    invoke-static {v7, v0, v9, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e5\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v3, v4, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e3\u06e8\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v8, "\u06e7\u06e8\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    const/16 v1, 0xd2c

    const/16 v5, 0x3e0

    invoke-static {v7, v1, v9, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e6\u06e0\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_c
    aput-object v5, v2, v9

    const-string v1, "\u06e1\u06e8\u06e7"

    move-object v8, v1

    goto :goto_0

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e1\u06e8\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_e
    sget v10, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    const-string v1, "\u06e3\u06e5\u06e1"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e2\u06e7\u06e2"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_10
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e1\u06e4\u06e7"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_11
    return-object v6

    :sswitch_data_0
    .sparse-switch
        0xdc9f -> :sswitch_f
        0x1aa7f8 -> :sswitch_0
        0x1aab03 -> :sswitch_8
        0x1aabbf -> :sswitch_2
        0x1aaf24 -> :sswitch_e
        0x1aaf7d -> :sswitch_4
        0x1aafa0 -> :sswitch_9
        0x1ab283 -> :sswitch_7
        0x1ab33d -> :sswitch_3
        0x1ab6bf -> :sswitch_1
        0x1ab71f -> :sswitch_11
        0x1abd87 -> :sswitch_a
        0x1ac165 -> :sswitch_10
        0x1ac16d -> :sswitch_6
        0x1ac1c7 -> :sswitch_c
        0x1ac50c -> :sswitch_5
        0x1ac624 -> :sswitch_d
        0x1ac967 -> :sswitch_b
    .end sparse-switch
.end method

.method synthetic lambda$40$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e5\u06e8\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v7, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    const-string v1, "\u06df\u06e2\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v4, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e0\u06e1\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    aput-object v0, v2, v9

    const-string v1, "\u06e7\u06df\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v6, "\u06e4\u06e7\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v6, "\u06e0\u06e0\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v6, "\u06e7\u06e3\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v8, v7, 0x130

    const-string v1, "\u06e8\u06e5"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_6
    const/16 v0, 0xd42

    const/16 v1, 0xbdb

    invoke-static {v5, v0, v9, v1}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e7\u06e3\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v8, v7, 0x10c

    const-string v1, "\u06e8\u06e4\u06e4"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_8
    sget v7, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    const-string v1, "\u06e4\u06e4\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdcfd -> :sswitch_6
        0x1aa762 -> :sswitch_5
        0x1aaae5 -> :sswitch_8
        0x1aaaff -> :sswitch_9
        0x1aba67 -> :sswitch_7
        0x1ababd -> :sswitch_4
        0x1abe9f -> :sswitch_2
        0x1ac50b -> :sswitch_0
        0x1ac58c -> :sswitch_3
        0x1ac968 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic lambda$41$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e8\u06e5\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object v4

    :sswitch_0
    aput-object v5, v6, v10

    const-string v1, "\u06e4\u06e8\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e0\u06e8\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit8 v9, v8, -0x7b

    const-string v1, "\u06e6\u06e3\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    const-string v1, "\u06e0\u06e1\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    xor-int/lit8 v9, v8, -0x6e

    const-string v1, "\u06e8\u06e4\u06e0"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_5
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e2\u06e1\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v0, v2, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e0\u06e5\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    sget v8, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    const-string v1, "\u06e1\u06e8\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    sget v8, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    const-string v1, "\u06e1\u06e4\u06e5"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    const/16 v1, 0xd58

    const/16 v5, 0x680

    invoke-static {v3, v1, v10, v5}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e7\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e8\u06e1\u06e2"

    move-object v2, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab05 -> :sswitch_a
        0x1aabd7 -> :sswitch_8
        0x1aaf22 -> :sswitch_4
        0x1aaf9c -> :sswitch_2
        0x1ab281 -> :sswitch_7
        0x1abae0 -> :sswitch_6
        0x1ac1c8 -> :sswitch_0
        0x1ac240 -> :sswitch_5
        0x1ac909 -> :sswitch_1
        0x1ac964 -> :sswitch_9
        0x1ac982 -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic lambda$42$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e4\u06e1\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e6\u06df\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e0\u06e6\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    sget v9, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    const-string v1, "\u06e0\u06e2\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_2
    xor-int/lit8 v8, v10, -0x63

    const-string v1, "\u06df\u06e3\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    const/16 v0, 0xd70

    const/16 v1, 0xb53

    invoke-static {v5, v0, v8, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e1\u06e5\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    aput-object v0, v3, v8

    const-string v1, "\u06df\u06e6\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v4, v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e1\u06df\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v8, v10, -0x25a

    const-string v1, "\u06e2\u06e3\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e2\u06e2\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    sget v9, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    const-string v1, "\u06e8\u06e2\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e7\u06df\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa77e -> :sswitch_3
        0x1aa7dc -> :sswitch_5
        0x1aab23 -> :sswitch_6
        0x1aaba0 -> :sswitch_7
        0x1aae85 -> :sswitch_a
        0x1ab2a1 -> :sswitch_8
        0x1ab2be -> :sswitch_4
        0x1aba05 -> :sswitch_9
        0x1ac148 -> :sswitch_1
        0x1ac508 -> :sswitch_0
        0x1ac92e -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic lambda$43$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e8\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e1\u06df\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    sget v9, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    const-string v1, "\u06e0\u06e6\u06e4"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v8, v10, 0x31f

    const-string v1, "\u06e1\u06e4\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    const-string v1, "\u06e3\u06e0\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e0\u06e3\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0xd88

    const/16 v6, 0x481

    invoke-static {v4, v1, v8, v6}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e7\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e3\u06e0\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    sget v9, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    const-string v1, "\u06e6\u06e5\u06e4"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v8, v10, 0x20c

    const-string v1, "\u06e3\u06e1\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    aput-object v6, v3, v8

    const-string v1, "\u06e8\u06e8\u06e5"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v0, v5, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e7\u06e2\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_a
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcfa -> :sswitch_2
        0x1aab44 -> :sswitch_5
        0x1aab9e -> :sswitch_1
        0x1aae88 -> :sswitch_0
        0x1aaf25 -> :sswitch_8
        0x1ab624 -> :sswitch_6
        0x1ab626 -> :sswitch_3
        0x1ab646 -> :sswitch_4
        0x1ac205 -> :sswitch_7
        0x1ac568 -> :sswitch_a
        0x1ac9e5 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$44$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06df\u06e3\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v9, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    const-string v1, "\u06e3\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_0
    aput-object v5, v3, v8

    const-string v1, "\u06df\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    sget v9, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v1, "\u06e4\u06e5\u06e1"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v7, "\u06e0\u06e1\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v0

    const-string v1, "\u06e6\u06e0\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    xor-int/lit8 v8, v10, 0x5b

    const-string v1, "\u06e8\u06e0\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    const/16 v1, 0xdaa

    const/16 v5, 0xaa3

    invoke-static {v0, v1, v8, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e6\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v4, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e2\u06e7\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e8\u06df\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v8, v10, 0x382

    const-string v1, "\u06e7\u06e2\u06e5"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06e3\u06e1\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_a
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe7 -> :sswitch_6
        0xdc65 -> :sswitch_4
        0x1aa784 -> :sswitch_9
        0x1aaafe -> :sswitch_3
        0x1ab340 -> :sswitch_a
        0x1ab648 -> :sswitch_2
        0x1aba80 -> :sswitch_8
        0x1ac223 -> :sswitch_7
        0x1ac56a -> :sswitch_0
        0x1ac8cb -> :sswitch_1
        0x1ac8ef -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$45$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0xdbc

    sget v5, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v5, v5, -0x12d

    const/16 v6, 0x2c5

    invoke-static {v3, v4, v5, v6}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0xe02

    sget v5, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v5, v5, -0x1ce

    const/16 v6, 0x827

    invoke-static {v3, v4, v5, v6}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۡۢۢ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :sswitch_5
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$46$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xe0b

    sget v6, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v6, v6, -0x209

    const/16 v7, 0x4cb

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v1, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۥۢ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_8
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    move-object v0, v2

    :goto_4
    return-object v0

    :sswitch_c
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۢۨۦ(Ljava/lang/Object;)I

    move-result v4

    const v1, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v1, 0xbf39

    goto :goto_5

    :sswitch_e
    const/4 v1, 0x1

    if-ne v4, v1, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۡۨ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤ۟ۤ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xe5c

    sget v6, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v6, v6, 0x2e8

    const/16 v7, 0xac6

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v4, :cond_4

    const v1, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v1, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v4, 0xe72

    sget v5, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v5, v5, 0x1ee

    const/16 v6, 0x653

    invoke-static {v1, v4, v5, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۤۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_13
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-eqz v4, :cond_5

    const v1, 0xc2db

    goto :goto_7

    :sswitch_15
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۧۡۥ(Ljava/lang/Object;)I

    move-result v4

    sget v5, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const v1, 0xc2fa

    :goto_8
    const v6, 0xc30b

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    xor-int/lit16 v1, v5, 0x70d

    and-int/2addr v1, v4

    if-eqz v1, :cond_6

    const v1, 0xc5e2

    goto :goto_8

    :cond_6
    :sswitch_17
    const v1, 0xc5c3

    goto :goto_8

    :sswitch_18
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    :sswitch_19
    move-object v0, v2

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_19
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_19
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_8
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_8
        0x6e9 -> :sswitch_18
    .end sparse-switch
.end method

.method synthetic lambda$47$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xe76

    sget v6, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v6, v6, 0x32c

    const/16 v7, 0x9ab

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0xea9

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x128

    const/16 v5, 0x703

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0xeb7

    sget v5, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v5, v5, 0x389

    const/16 v6, 0x2cb

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xec2

    sget v6, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v6, v6, 0x28f

    const/16 v7, 0x9ca

    invoke-static {v4, v5, v6, v7}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/String;

    sget v6, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v6, v6, 0x35b

    aput-object v4, v5, v6

    sget v4, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v4, v4, 0x10d

    aput-object v2, v5, v4

    sget v2, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v2, v2, -0x118

    aput-object v3, v5, v2

    invoke-static {v5}, Landroidx/startup/ۤۧۥۣ;->ۡ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v4

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xecd

    sget v7, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v7, v7, -0x1e

    const/16 v8, 0xb05

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xedb

    sget v7, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v7, v7, -0x21c

    const/16 v8, 0x48c

    invoke-static {v5, v6, v7, v8}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0xedf

    sget v8, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v8, v8, -0x8

    const/16 v9, 0xb50

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۡۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {v4, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦ۠ۦ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢ۠۟(Ljava/lang/Object;)I

    move-result v3

    const v0, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbf39

    goto :goto_4

    :sswitch_c
    if-lez v3, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_d
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۥۥ۟(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    return-object v0

    :sswitch_e
    move-object v0, v1

    goto :goto_5

    :sswitch_f
    move-object v0, v1

    goto :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_e
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_f
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch
.end method

.method synthetic lambda$48$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xef3

    sget v7, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v7, v7, -0x1cb

    const/16 v8, 0xb98

    invoke-static {v5, v6, v7, v8}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xf01

    sget v7, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v7, v7, 0x21e

    const/16 v8, 0x598

    invoke-static {v5, v6, v7, v8}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۤۧۥ()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0xf11

    sget v8, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v8, v8, -0x61

    const/16 v9, 0x32f

    invoke-static {v6, v7, v8, v9}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0xf3b

    sget v8, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v8, v8, 0x173

    const/16 v9, 0x9e0

    invoke-static {v6, v7, v8, v9}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v7

    invoke-static {v5, v6, v7}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۧۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۠ۦ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۤۤۧ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :sswitch_8
    invoke-static {v4}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    move-object v0, v1

    :goto_4
    return-object v0

    :sswitch_c
    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v5

    const v3, 0xbefb

    :goto_5
    const v6, 0xbf0c

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v3, 0xbf39

    goto :goto_5

    :sswitch_e
    if-eqz v5, :cond_3

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۟(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۡۡۦ(Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v3, :cond_4

    const v0, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_6

    :sswitch_12
    move-object v0, v2

    goto :goto_4

    :sswitch_13
    move-object v0, v1

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_13
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_13
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$49$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۤۧۥ()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xf42

    sget v7, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v7, v7, 0x63

    const/16 v8, 0x966

    invoke-static {v5, v6, v7, v8}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0xf6c

    sget v8, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v8, v8, -0x3d

    const/16 v9, 0x645

    invoke-static {v6, v7, v8, v9}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v7

    invoke-static {v4, v6, v7}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۧۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۤۧۥ()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xf75

    sget v7, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v7, v7, 0x353

    const/16 v8, 0x812

    invoke-static {v5, v6, v7, v8}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۧۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۤۤۧ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_0
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x0

    :goto_1
    return-object v0

    :sswitch_4
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v4

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-eqz v4, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۟(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۠۠ۤۨ(Ljava/lang/Object;)I

    move-result v2

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    const/16 v0, 0x8

    if-gt v2, v0, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    move-object v0, v1

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_0
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_0
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$5$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e6\u06e7\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    aput-object v4, v3, v7

    const-string v1, "\u06e0\u06e8\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v6, "\u06e5\u06e7\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e2\u06e4\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    sget v8, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    const-string v1, "\u06e8\u06e0\u06e8"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_3
    xor-int/lit8 v7, v9, -0x64

    const-string v1, "\u06e1\u06e1\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    sget v8, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    const-string v1, "\u06df\u06df\u06e2"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_5
    xor-int/lit8 v7, v9, 0x2

    const-string v1, "\u06e6\u06e0\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    const/16 v1, 0xf7d

    const/16 v4, 0x240

    invoke-static {v2, v1, v7, v4}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e2\u06e2\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    const-string v1, "\u06e8\u06e5\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v6, "\u06e2\u06e5\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_9
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x1aa702 -> :sswitch_3
        0x1aabd9 -> :sswitch_1
        0x1aaec6 -> :sswitch_6
        0x1ab2a5 -> :sswitch_8
        0x1ab2e3 -> :sswitch_9
        0x1ab2fe -> :sswitch_2
        0x1abe80 -> :sswitch_4
        0x1ac245 -> :sswitch_7
        0x1ac8f0 -> :sswitch_5
        0x1ac989 -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic lambda$50$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0xfa6

    sget v6, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v6, v6, -0x30a

    const/16 v7, 0xcac

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۤۧۥ()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xfd1

    sget v7, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v7, v7, 0x39

    const/16 v8, 0x35d

    invoke-static {v5, v6, v7, v8}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0xffb

    sget v7, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v7, v7, 0x38b

    const/16 v8, 0x2ef

    invoke-static {v5, v6, v7, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۧۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1004

    sget v6, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v6, v6, -0x3d

    const/16 v7, 0x3f6

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x100d

    sget v6, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v6, v6, -0x1ab

    const/16 v7, 0x379

    invoke-static {v4, v5, v6, v7}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1012

    sget v6, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v6, v6, -0x1ae

    const/16 v7, 0x625

    invoke-static {v4, v5, v6, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0x1022

    sget v5, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v5, v5, 0x5d

    const/16 v6, 0x698

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    const/4 v0, 0x0

    :sswitch_8
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$51$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1036

    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v6, v6, -0x3f8

    const/16 v7, 0xb41

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۡۧۥ(Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v2, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda85;

    invoke-direct {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda85;-><init>()V

    invoke-static {v0, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۟ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۤۢۥۢ(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۦۨۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v2, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v0, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    return-object v0

    :sswitch_b
    move-object v0, v1

    goto :goto_4

    :sswitch_c
    move-object v0, v1

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_c
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$53$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1088

    sget v6, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v6, v6, 0x121

    const/16 v7, 0xca4

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۡۧۥ(Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v2, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda11;

    invoke-direct {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda11;-><init>()V

    invoke-static {v0, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۟ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۤۢۥۢ(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۦۨۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v2, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v0, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    return-object v0

    :sswitch_b
    move-object v0, v1

    goto :goto_4

    :sswitch_c
    move-object v0, v1

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_c
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$55$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v8, 0x1

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x10dd

    sget v6, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v6, v6, 0x32f

    const/16 v7, 0x3e4

    invoke-static {v4, v5, v6, v7}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x110d

    sget v6, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v6, v6, -0x15

    const/16 v7, 0x48c

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۠ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    sget v4, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v4, v4, 0x1f3

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۠(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۢ۠۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v2, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v0

    const/16 v3, 0x1114

    const/16 v4, 0x355

    invoke-static {v0, v3, v8, v4}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v3, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    sget v0, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v0, v0, 0x2b7

    invoke-static {v2, v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣۥ(Ljava/lang/Object;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v2, v0}, Landroidx/core/ۤۦ۟ۢ;->۟۟ۢۤ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x1115

    const/16 v4, 0xbee

    invoke-static {v2, v3, v8, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v2, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v3, :cond_4

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v2

    const/16 v3, 0x1116

    const/16 v4, 0x62f

    invoke-static {v2, v3, v8, v4}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/activity/ۤۧۧۧ;->۟۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc202

    :goto_5
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-eqz v3, :cond_5

    const v2, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_10
    const v2, 0xc240

    goto :goto_5

    :sswitch_11
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v8, v2}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    :sswitch_12
    const/16 v2, 0x2f

    const/16 v3, 0x2e

    invoke-static {v0, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۡ۟ۦ۟(Ljava/lang/Object;CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_6

    :cond_6
    :sswitch_13
    const v2, 0xc2bc

    goto :goto_6

    :sswitch_14
    if-eqz v3, :cond_6

    const v2, 0xc2db

    goto :goto_6

    :sswitch_15
    move-object v0, v1

    :sswitch_16
    move-object v1, v0

    :sswitch_17
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_17
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_17
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_17
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_17
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_15
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_14
    .end sparse-switch
.end method

.method synthetic lambda$56$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0x1117

    sget v5, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v5, v5, 0x7c

    const/16 v6, 0x46f

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1125

    sget v6, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v6, v6, 0x307

    const/16 v7, 0x647

    invoke-static {v4, v5, v6, v7}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x112f

    sget v6, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v6, v6, -0x6a

    const/16 v7, 0xc38

    invoke-static {v4, v5, v6, v7}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    const/4 v0, 0x0

    :sswitch_8
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$57$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v9, 0x1

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1136

    sget v6, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v6, v6, -0x1c5

    const/16 v7, 0x7de

    invoke-static {v4, v5, v6, v7}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v3, v9}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1159

    sget v6, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v6, v6, 0x38f

    const/16 v7, 0x4be

    invoke-static {v4, v5, v6, v7}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1166

    sget v6, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v6, v6, -0x3c8

    const/16 v7, 0xc34

    invoke-static {v4, v5, v6, v7}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x116a

    sget v7, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v7, v7, -0x1d6

    const/16 v8, 0xb04

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x117b

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v7, v7, -0x7d

    const/16 v8, 0x762

    invoke-static {v5, v6, v7, v8}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {v4, v9}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۡۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$58$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1181

    sget v6, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v6, v6, 0x189

    const/16 v7, 0xc73

    invoke-static {v4, v5, v6, v7}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x11b7

    sget v6, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v6, v6, 0x38f

    const/16 v7, 0x8d8

    invoke-static {v4, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۟۟(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$59$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x11e6

    sget v6, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v6, v6, -0x1d5

    const/16 v7, 0x5a3

    invoke-static {v4, v5, v6, v7}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x11f6

    sget v6, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v6, v6, 0x244

    const/16 v7, 0x590

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x120d

    sget v7, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v7, v7, -0x1ed

    const/16 v8, 0x28a

    invoke-static {v5, v6, v7, v8}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۟۟(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v5

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۦۤۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۥۨۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    invoke-static {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۡۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$6$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e3\u06e6\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e0\u06e6\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    sget v8, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    const-string v1, "\u06e6\u06e0\u06e1"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v6, "\u06e0\u06e8\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v6, "\u06e3\u06e0\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    aput-object v5, v0, v7

    const-string v1, "\u06e1\u06df\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    sget v8, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06e6\u06e2"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v7, v9, 0x321

    const-string v1, "\u06e2\u06e4\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u06e8\u06e0\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit8 v7, v9, -0x35

    const-string v1, "\u06e1\u06e4\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    const/16 v1, 0x1214

    const/16 v5, 0xc26

    invoke-static {v3, v1, v7, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e8\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0xdcbc -> :sswitch_5
        0xdcfd -> :sswitch_6
        0x1aab9f -> :sswitch_9
        0x1aabe0 -> :sswitch_2
        0x1aaf20 -> :sswitch_3
        0x1ab2e4 -> :sswitch_8
        0x1ab626 -> :sswitch_4
        0x1ab6dd -> :sswitch_1
        0x1ac167 -> :sswitch_7
        0x1ac8ef -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic lambda$60$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e2\u06e0\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    aput-object v6, v3, v8

    const-string v1, "\u06e5\u06e0\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "\u06e2\u06e6\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v7, "\u06e5\u06e7\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v4, v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e3\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    sget v9, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    const-string v1, "\u06e3\u06e0\u06e2"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_4
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v7, "\u06e3\u06e6\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v8, v10, 0x2b6

    const-string v1, "\u06e4\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    sget v9, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v1, "\u06e6\u06e8\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_7
    const/16 v1, 0x1240

    const/16 v6, 0x62c

    invoke-static {v5, v1, v8, v6}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e0\u06e2\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v7, "\u06df\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v8, v10, 0x15f

    const-string v1, "\u06df\u06e8\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0xdc62 -> :sswitch_a
        0xdc7e -> :sswitch_7
        0x1aab20 -> :sswitch_4
        0x1ab265 -> :sswitch_8
        0x1ab31f -> :sswitch_1
        0x1ab625 -> :sswitch_9
        0x1ab6dd -> :sswitch_3
        0x1abdac -> :sswitch_2
        0x1abe84 -> :sswitch_6
        0x1ac266 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$61$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v11, 0x2

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0x1272

    sget v5, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v5, v5, 0x294

    const/16 v6, 0x89c

    invoke-static {v3, v4, v5, v6}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v3

    const/16 v4, 0x1279

    sget v5, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v5, v5, -0x74

    const/16 v6, 0x26c

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x128f

    sget v6, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v6, v6, 0x16e

    const/16 v7, 0xbaa

    invoke-static {v4, v5, v6, v7}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x12a6

    sget v7, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v7, v7, 0x31d

    const/16 v8, 0xae3

    invoke-static {v5, v6, v7, v8}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v5

    new-array v6, v11, [Ljava/lang/String;

    sget v7, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v7, v7, 0x72

    aput-object v4, v6, v7

    sget v7, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v7, v7, 0x252

    aput-object v5, v6, v7

    invoke-static {v3, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0x12b6

    sget v8, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v8, v8, -0x314

    const/16 v9, 0xba0

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v7

    const/16 v8, 0x12e7

    sget v9, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v9, v9, -0x32c

    const/16 v10, 0xca2

    invoke-static {v7, v8, v9, v10}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    new-array v3, v11, [Ljava/lang/String;

    sget v6, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v6, v6, 0x20e

    aput-object v4, v3, v6

    sget v4, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x20f

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v3

    invoke-static {v2, v7, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v1, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    :goto_2
    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    if-eqz v0, :cond_2

    const v1, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_9
    return-object v0

    :sswitch_a
    const v1, 0xbe9e

    goto :goto_4

    :sswitch_b
    const/4 v0, 0x0

    goto :goto_5

    :sswitch_c
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const/16 v2, 0x12f0

    sget v3, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v3, v3, 0xcc

    const/16 v4, 0x431

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_d
    move-object v0, v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_d
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method synthetic lambda$62$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x12ff

    sget v6, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v6, v6, -0x55

    const/16 v7, 0x9cf

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۤۥۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۡۧۥ(Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v2, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۟ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۤۢۥۢ(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۦۨۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v2, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v0, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    return-object v0

    :sswitch_b
    move-object v0, v1

    goto :goto_4

    :sswitch_c
    move-object v0, v1

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_c
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$65$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1346

    sget v6, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v6, v6, -0x386

    const/16 v7, 0x4c9

    invoke-static {v4, v5, v6, v7}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1381

    sget v6, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v6, v6, 0x130

    const/16 v7, 0x18d

    invoke-static {v4, v5, v6, v7}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x1397

    sget v7, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v7, v7, 0x333

    const/16 v8, 0x9b9

    invoke-static {v5, v6, v7, v8}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0x13a8

    sget v8, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v8, v8, -0x1b5

    const/16 v9, 0xa52

    invoke-static {v6, v7, v8, v9}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/String;

    sget v8, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v8, v8, 0x31f

    aput-object v6, v7, v8

    sget v6, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v6, v6, -0x35

    aput-object v4, v7, v6

    sget v4, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v4, v4, 0x3bb

    aput-object v5, v7, v4

    invoke-static {v3, v7}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x13c3

    sget v6, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v6, v6, -0x1fb

    const/16 v7, 0x6ae

    invoke-static {v4, v5, v6, v7}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$66$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x13d4

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x7b

    const/16 v7, 0x9e1

    invoke-static {v4, v5, v6, v7}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۡۢۢ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۡۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-nez v0, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_6
    move-object v0, v1

    goto :goto_1

    :sswitch_7
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۟(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟ۢۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_8
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    if-nez v2, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbe41

    goto :goto_3

    :sswitch_b
    move-object v0, v1

    goto :goto_1

    :sswitch_c
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۠ۦۢ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢ۟(I)Z

    move-result v4

    const v2, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_d
    const v2, 0xbebd

    goto :goto_4

    :sswitch_e
    if-eqz v4, :cond_3

    const v2, 0xbedc

    goto :goto_4

    :sswitch_f
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡ۠ۢۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1406

    sget v6, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v6, v6, -0x1a3

    const/16 v7, 0x50e

    invoke-static {v4, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v2, 0xbf39

    goto :goto_5

    :sswitch_11
    if-nez v4, :cond_4

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_12
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨ۠ۢ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v4

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_13
    if-eqz v4, :cond_5

    const v0, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_14
    const v0, 0xc240

    goto :goto_6

    :sswitch_15
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v2, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v6

    const/16 v7, 0x1413

    sget v8, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v8, v8, 0x121

    const/16 v9, 0x3ef

    invoke-static {v6, v7, v8, v9}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v7

    invoke-static {v5, v6, v7}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v5

    invoke-static {v2, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۧۦ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_6
    :sswitch_16
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_17
    if-eqz v2, :cond_6

    const v0, 0xc2db

    goto :goto_7

    :sswitch_18
    const/4 v0, 0x0

    const v2, 0xc2fa

    :goto_8
    const v5, 0xc30b

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_19
    const v2, 0xc5a4

    goto :goto_8

    :sswitch_1a
    const/4 v0, 0x1

    :sswitch_1b
    const v2, 0xc601

    :goto_9
    const v5, 0xc612

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_1c
    if-eqz v0, :cond_7

    const v2, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1d
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1e
    invoke-static {v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_b
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_d
        0x2d -> :sswitch_8
        0x4c -> :sswitch_f
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_16
        0x33 -> :sswitch_1a
        0x54 -> :sswitch_18
        0xf1 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_19
        0x6af -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1c
        0x2d -> :sswitch_8
        0x32 -> :sswitch_1d
        0x4c -> :sswitch_1e
    .end sparse-switch
.end method

.method synthetic lambda$67$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x141a

    sget v6, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v6, v6, 0x97

    const/16 v7, 0xb34

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۡۢۢ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1435

    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v6, v6, -0x387

    const/16 v7, 0x96d

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$68$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x17c

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۟۟(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1458

    sget v6, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v6, v6, 0x1fa

    const/16 v7, 0x1ae

    invoke-static {v4, v5, v6, v7}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    sget v6, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v6, v6, 0x3b9

    aput-object v4, v5, v6

    invoke-static {v3, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1468

    sget v6, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v6, v6, 0x322

    const/16 v7, 0x5eb

    invoke-static {v4, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x1497

    sget v7, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v7, v7, -0x259

    const/16 v8, 0x43c

    invoke-static {v5, v6, v7, v8}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۡۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const/4 v0, 0x0

    :sswitch_5
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$69$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x14ce

    sget v6, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v6, v6, 0x354

    const/16 v7, 0x8f0

    invoke-static {v4, v5, v6, v7}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1519

    sget v6, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v6, v6, 0x9c

    const/16 v7, 0x92d

    invoke-static {v4, v5, v6, v7}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    sget v6, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v6, v6, -0x3c7

    aput-object v4, v5, v6

    sget v6, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v6, v6, -0x36

    aput-object v4, v5, v6

    invoke-static {v3, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$7$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06df\u06e6\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v6, "\u06e2\u06e3\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    aput-object v2, v4, v9

    const-string v1, "\u06e3\u06e2\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    const-string v1, "\u06e5\u06e3\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    sget v7, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    const-string v1, "\u06e0\u06e2\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v8, v7, 0x15b

    const-string v1, "\u06e7\u06e6\u06e3"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v6, "\u06df\u06e2\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    sget v7, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    const-string v1, "\u06e8\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v8, v7, -0x1be

    const-string v1, "\u06e0\u06e4\u06df"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e5\u06e6\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    const/16 v1, 0x1529

    const/16 v2, 0x2af

    invoke-static {v3, v1, v9, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e1\u06e7\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_9
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0xdcfc -> :sswitch_6
        0x1aa75d -> :sswitch_2
        0x1aa7dd -> :sswitch_1
        0x1aab1d -> :sswitch_3
        0x1aab5b -> :sswitch_0
        0x1ab2c1 -> :sswitch_5
        0x1ab666 -> :sswitch_7
        0x1abe02 -> :sswitch_4
        0x1abe60 -> :sswitch_9
        0x1ac5e4 -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$70$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x154b

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x2

    const/16 v7, 0x836

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1596

    sget v6, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v6, v6, -0x63

    const/16 v7, 0x176

    invoke-static {v4, v5, v6, v7}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۠(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$71$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x15ad

    sget v6, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v6, v6, 0x186

    const/16 v7, 0xabc

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x15e6

    sget v6, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v6, v6, -0x228

    const/16 v7, 0x6a9

    invoke-static {v4, v5, v6, v7}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۠(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$72$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x161e

    sget v6, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v6, v6, 0x354

    const/16 v7, 0x45c

    invoke-static {v4, v5, v6, v7}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1669

    sget v6, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v6, v6, 0x122

    const/16 v7, 0x344

    invoke-static {v4, v5, v6, v7}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۠(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$73$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1697

    sget v6, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v6, v6, -0x223

    const/16 v7, 0xc61

    invoke-static {v4, v5, v6, v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x16d4

    sget v6, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v6, v6, -0x38

    const/16 v7, 0x3fa

    invoke-static {v4, v5, v6, v7}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x16d7

    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v7, v7, 0xd3

    const/16 v8, 0x74b

    invoke-static {v5, v6, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    sget v7, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v7, v7, -0x36

    aput-object v4, v6, v7

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x10a

    aput-object v5, v6, v4

    invoke-static {v3, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x16e7

    sget v6, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v6, v6, 0x280

    const/16 v7, 0x988

    invoke-static {v4, v5, v6, v7}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$74$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x16eb

    sget v6, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v6, v6, 0x4c

    const/16 v7, 0x7ae

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x1729

    sget v7, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v7, v7, 0x286

    const/16 v8, 0x722

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x6e

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x172b

    sget v6, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v6, v6, 0x30e

    const/16 v7, 0xcbb

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$75$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x173c

    sget v6, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v6, v6, 0x181

    const/16 v7, 0xa3c

    invoke-static {v4, v5, v6, v7}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x177a

    sget v7, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v7, v7, -0x118

    const/16 v8, 0x307

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x177c

    sget v6, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v6, v6, -0x269

    const/16 v7, 0x292

    invoke-static {v4, v5, v6, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v4

    const/16 v5, 0x1783

    sget v6, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v6, v6, 0xd9

    const/16 v7, 0x2aa

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$76$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e0\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v8, "\u06e3\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    sget v10, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    const-string v1, "\u06df\u06e8\u06e8"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v8, "\u06e0\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    aput-object v4, v6, v9

    const-string v1, "\u06df\u06e8\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v9, v11, -0xe7

    const-string v1, "\u06e1\u06e7\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e1\u06e2\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v9, v11, -0x3a5

    const-string v1, "\u06e7\u06e1\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e4\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    const/16 v1, 0x17ad

    const/16 v4, 0x3a6

    invoke-static {v7, v1, v9, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e0\u06e7\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    const/16 v1, 0x17b7

    const/16 v5, 0xc9c

    invoke-static {v7, v1, v9, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e3\u06e8\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    aput-object v5, v6, v9

    const-string v1, "\u06e7\u06e8\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_a
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e5\u06e8\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v9, v11, 0x382

    const-string v1, "\u06df\u06e8\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit8 v9, v11, -0x7e

    const-string v1, "\u06e0\u06df\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_d
    sget v10, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v1, "\u06e3\u06df\u06df"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_e
    sget v10, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    const-string v1, "\u06e5\u06df"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_f
    invoke-static {v2, v3, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e6\u06e6\u06e7"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_10
    sget v10, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    const-string v1, "\u06e0\u06e4\u06e3"

    move-object v8, v1

    move v11, v10

    goto/16 :goto_0

    :sswitch_11
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_6
        0xdc62 -> :sswitch_1
        0xdc7e -> :sswitch_10
        0xdc9a -> :sswitch_c
        0x1aa818 -> :sswitch_2
        0x1aa81b -> :sswitch_0
        0x1aa81f -> :sswitch_5
        0x1aaac9 -> :sswitch_8
        0x1aab5f -> :sswitch_3
        0x1aabbf -> :sswitch_4
        0x1aaee1 -> :sswitch_e
        0x1aaf7d -> :sswitch_7
        0x1ab603 -> :sswitch_b
        0x1ab722 -> :sswitch_a
        0x1abea0 -> :sswitch_d
        0x1ac227 -> :sswitch_11
        0x1ac54e -> :sswitch_9
        0x1ac621 -> :sswitch_f
    .end sparse-switch
.end method

.method synthetic lambda$77$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e0\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v10, v9, 0x20f

    const-string v1, "\u06e5\u06e4\u06e1"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v8, "\u06e1\u06e5\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x17bf

    const/16 v1, 0x715

    invoke-static {v7, v0, v11, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e8\u06e5\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_2
    aput-object v0, v4, v11

    const-string v1, "\u06e3\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v10, v9, 0x35d

    const-string v1, "\u06e7\u06e3\u06e1"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_4
    xor-int/lit8 v10, v9, 0x13

    const-string v1, "\u06e7\u06e3\u06e6"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_5
    aput-object v3, v4, v11

    const-string v1, "\u06e2\u06e6\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit8 v10, v9, -0x62

    const-string v1, "\u06df\u06e7"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_7
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v8, "\u06e2\u06e5\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v8, "\u06e4\u06e2\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v2, v5, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e1\u06e7\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e2\u06df\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_b
    sget v9, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    const-string v1, "\u06e0\u06e4\u06e7"

    move-object v8, v1

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v1

    const-string v8, "\u06e7\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_d
    sget v9, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    const-string v1, "\u06e4\u06e2\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_e
    sget v9, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    const-string v1, "\u06e5\u06e0\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_f
    const/16 v1, 0x17c3

    const/16 v3, 0x5f4

    invoke-static {v7, v1, v11, v3}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06df\u06e7\u06e8"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_10
    sget v9, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    const-string v1, "\u06e2\u06e7\u06e0"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_11
    return-object v6

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_1
        0xdc03 -> :sswitch_0
        0xdc5f -> :sswitch_10
        0xdcdf -> :sswitch_e
        0x1aa800 -> :sswitch_7
        0x1aab63 -> :sswitch_6
        0x1aaf41 -> :sswitch_8
        0x1aaf7f -> :sswitch_11
        0x1ab244 -> :sswitch_b
        0x1ab304 -> :sswitch_d
        0x1ab321 -> :sswitch_9
        0x1aba27 -> :sswitch_a
        0x1aba28 -> :sswitch_4
        0x1abda8 -> :sswitch_3
        0x1abe22 -> :sswitch_5
        0x1ac585 -> :sswitch_f
        0x1ac58a -> :sswitch_2
        0x1ac984 -> :sswitch_c
    .end sparse-switch
.end method

.method synthetic lambda$78$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x17c9

    sget v7, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v7, v7, -0x20

    const/16 v8, 0xaf2

    invoke-static {v5, v6, v7, v8}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x17f3

    sget v7, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v7, v7, 0x4

    const/16 v8, 0xa2b

    invoke-static {v5, v6, v7, v8}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x180a

    sget v7, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v7, v7, 0x32b

    const/16 v8, 0x4ac

    invoke-static {v5, v6, v7, v8}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۤ()[S

    move-result-object v5

    const/16 v6, 0x1828

    sget v7, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v7, v7, 0x261

    const/16 v8, 0x2b2

    invoke-static {v5, v6, v7, v8}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟۟۠ۡۡ()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۦۢ۠()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟ۢۥۧ()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۢۢۧۨ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v3}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    move-object v0, v1

    :sswitch_6
    move-object v1, v0

    :sswitch_7
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_7
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method synthetic lambda$79$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۦۡۧۧ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۠ۥۤۤ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟۟۠ۡۡ()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۦۢ۠()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟ۢۥۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۢۢۧۨ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    const/4 v0, 0x0

    :sswitch_8
    return-object v0

    :sswitch_9
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤۦۣ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic lambda$8$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e3\u06e2\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v7, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    const-string v1, "\u06e3\u06e3\u06e4"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣۤۦ()Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e3\u06e4\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e1\u06df\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    aput-object v3, v0, v6

    const-string v1, "\u06e0\u06e5\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u06e5\u06df\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v5, "\u06e6\u06e7\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v6, v8, 0x2fe

    const-string v1, "\u06e1\u06e1\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x1aab7d -> :sswitch_1
        0x1aae89 -> :sswitch_6
        0x1aaec0 -> :sswitch_2
        0x1ab664 -> :sswitch_4
        0x1ab684 -> :sswitch_5
        0x1ab6a7 -> :sswitch_3
        0x1ac23f -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic lambda$80$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e2\u06e0\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit8 v9, v11, 0x2

    const-string v1, "\u06e8\u06e6\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_0
    aput-object v7, v0, v9

    const-string v1, "\u06e1\u06e3\u06e7"

    move-object v8, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v9, v11, 0x127

    const-string v1, "\u06e1\u06df\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v8, "\u06e8\u06e4\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u06e5\u06df\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۤۤۤ()Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e7\u06e4\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    sget v10, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    const-string v1, "\u06e5\u06e5"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_6
    sget v10, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    const-string v1, "\u06e1\u06df\u06e8"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_7
    xor-int/lit8 v9, v11, -0x38

    const-string v1, "\u06e3\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥ۟ۤۦ()Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e0\u06e2\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_9
    aput-object v4, v0, v9

    const-string v1, "\u06e0\u06e3\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟۠۟ۡ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v8, "\u06e4\u06e1\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->۠ۥۢۡ()Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e8\u06e4\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_c
    aput-object v3, v0, v9

    const-string v1, "\u06e4\u06e7\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_d
    sget v10, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    const-string v1, "\u06e1\u06e2\u06e4"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    :sswitch_e
    invoke-static {v5, v6, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e7\u06e0\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_f
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc65 -> :sswitch_0
        0x1aab25 -> :sswitch_b
        0x1aab43 -> :sswitch_6
        0x1aae85 -> :sswitch_c
        0x1aae8a -> :sswitch_1
        0x1aaee3 -> :sswitch_7
        0x1aaf05 -> :sswitch_e
        0x1ab269 -> :sswitch_2
        0x1aba04 -> :sswitch_8
        0x1abac5 -> :sswitch_d
        0x1abd8c -> :sswitch_5
        0x1ac529 -> :sswitch_f
        0x1ac5a9 -> :sswitch_3
        0x1ac965 -> :sswitch_a
        0x1ac96c -> :sswitch_4
        0x1ac9a4 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic lambda$81$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {}, Landroidx/loader/ۢۥ۟;->ۣۤ۟ۥ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡ۟ۢ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const/4 v0, 0x0

    :sswitch_5
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$82$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣ۟۟ۨۡ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {v4, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v3, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۣ۟۟ۤۤ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v0, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v1, v0

    :sswitch_9
    return-object v1

    :sswitch_a
    move-object v0, v1

    goto :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_9
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic lambda$83$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۡۧ۟()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {v4, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v1

    invoke-static {v3, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v0, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->۟ۤ۟ۨ۠()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۤۧۥ()Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v6

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۤ۟۟()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v6

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۤۨۦ()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v8

    invoke-static {v6, v7, v8}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۧۧۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    move-result-object v6

    invoke-static {v4, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۡ۟ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v1, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/luckypray/dexkit/result/FieldData;

    const/16 v3, 0x748

    :goto_2
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v1, :cond_2

    const v3, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v3, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v4

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v4, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۠ۢ۠ۢ()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v6

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۢ۠۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۠ۡۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v1

    invoke-static {v5, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۥۢۨ()Lorg/luckypray/dexkit/query/enums/UsingType;

    move-result-object v5

    invoke-static {v1, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۠ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v1

    invoke-static {v4, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v1

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x137

    invoke-static {v1, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۟۟(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v0, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    move-object v2, v0

    :sswitch_c
    return-object v2

    :sswitch_d
    move-object v0, v2

    goto :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_c
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_c
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_d
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method synthetic lambda$84$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤۧۧۨ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {v4, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v3, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡ۠ۤۧ()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧ۟۠ۤ()Lorg/luckypray/dexkit/query/enums/StringMatchType;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۣ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v0, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v1, v0

    :sswitch_9
    return-object v1

    :sswitch_a
    move-object v0, v1

    goto :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_9
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic lambda$85$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۡۦۧۥ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {v4, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v3, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۨۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡ۟ۢ()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    sget v6, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v6, v6, -0xe3

    aput-object v4, v5, v6

    invoke-static {v3, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۥۦ۟()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    sget v4, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v4, v4, 0x10f

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۟۟(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v0, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦ۟۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v1, v0

    :sswitch_9
    return-object v1

    :sswitch_a
    move-object v0, v1

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_9
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic lambda$86$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۤۢۡۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {v4, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v3, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۠۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥ۠۟ۢ()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v3

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢ۟ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۧۦۧ()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟۠ۨۧ۠()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۨۦ۠(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۦۧ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۥۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v0, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۡۧۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v1, v0

    :sswitch_9
    return-object v1

    :sswitch_a
    move-object v0, v1

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_9
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic lambda$87$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x1

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۨۤۨۤ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۢۨ۟()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۡ۠()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۢۢۦۧ()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v5

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->۟ۧۨۨ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v5

    invoke-static {v5, v10}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۥۧ(Ljava/lang/Object;I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v5

    invoke-static {v5, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v1

    invoke-static {v4, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۢۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v1

    invoke-static {v3, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟ۤۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۤۤۧ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :sswitch_3
    invoke-static {v4}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۨۦۧۨ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣ۟۠ۨۧ()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۥۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    const-wide/16 v6, 0x369

    sget v5, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    int-to-long v8, v5

    xor-long/2addr v6, v8

    invoke-static {v6, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v3, v5}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣ۟۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v5, v5, -0x3a7

    new-array v6, v5, [Ljava/lang/Number;

    invoke-static {v11}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v11

    invoke-static {v10}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v10

    const/4 v7, 0x2

    invoke-static {v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v6, v7

    invoke-static {v3, v6}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v0, v3}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {v1, v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۧۡۥۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۨ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v3, 0x748

    :goto_2
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-eqz v0, :cond_2

    const v3, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v3, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۣۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟ۢۥۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v1, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz v3, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_c
    invoke-static {v0, v10}, Landroidx/core/ۤۦ۟ۢ;->۟۟ۢۤ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    :sswitch_d
    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۢۢۧۨ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->۟۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_e
    const v1, 0xbf39

    goto :goto_4

    :sswitch_f
    if-eqz v3, :cond_4

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_10
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v11, v1}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    :sswitch_11
    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟۟۠ۡۡ()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۦۢ۠()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۦۤۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xc202

    :goto_5
    const v4, 0xc213

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_12
    if-eqz v3, :cond_5

    const v1, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_13
    const v1, 0xc240

    goto :goto_5

    :sswitch_14
    move-object v0, v2

    :sswitch_15
    move-object v2, v0

    :sswitch_16
    return-object v2

    :sswitch_17
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣ۟ۢۤۢ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_16
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_17
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_3
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_d
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_15
        0x53 -> :sswitch_14
    .end sparse-switch
.end method

.method synthetic lambda$9$kevin-fun-hook-DexKitFinder$SafeFinder()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e6\u06e1\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v7, v6, -0x109

    const-string v1, "\u06e5\u06e7\u06e1"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->۟ۢۥۥۥ(Ljava/lang/Object;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    const-string v5, "\u06e6\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v6, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    const-string v1, "\u06e8\u06e3\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    aput-object v2, v4, v8

    const-string v1, "\u06e2\u06df\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v5, "\u06e6\u06df\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۨ۟ۥۨ()Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e3\u06e5\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v3, v4}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e1\u06e5\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdcbc -> :sswitch_4
        0x1aaf3b -> :sswitch_6
        0x1ab247 -> :sswitch_5
        0x1ab6c3 -> :sswitch_3
        0x1abe7f -> :sswitch_2
        0x1ac148 -> :sswitch_1
        0x1ac18b -> :sswitch_0
    .end sparse-switch
.end method
